package com.tencent.thumbplayer.tplayer;

/* loaded from: classes13.dex */
public class TPPlayerProxy implements java.lang.reflect.InvocationHandler {
    private com.tencent.thumbplayer.tplayer.TPPlayer mPlayer;
    private com.tencent.thumbplayer.utils.TPThreadSwitch mSwitch;

    public TPPlayerProxy(com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer) {
        this.mPlayer = tPPlayer;
        this.mSwitch = new com.tencent.thumbplayer.utils.TPThreadSwitch(tPPlayer.getTag(), this.mPlayer.getLooper(), this.mPlayer);
    }

    private java.lang.Object[] beforeSetDataSource(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[0];
        if (obj != null && (obj instanceof android.os.ParcelFileDescriptor)) {
            try {
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) obj;
                objArr[0] = android.os.ParcelFileDescriptor.fromFd(parcelFileDescriptor.detachFd());
                parcelFileDescriptor.close();
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(this.mPlayer.getTag(), "setDataSource, fromFd has exception:" + e17.toString());
            }
        } else if (obj != null && (obj instanceof android.content.res.AssetFileDescriptor)) {
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
                objArr[0] = new android.content.res.AssetFileDescriptor(android.os.ParcelFileDescriptor.fromFd(assetFileDescriptor.getParcelFileDescriptor().detachFd()), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                assetFileDescriptor.close();
            } catch (java.lang.Exception e18) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(this.mPlayer.getTag(), "setDataSource, fromFd has exception:" + e18.toString());
            }
        }
        return objArr;
    }

    private java.lang.Object dealThreadSwitch(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.String name = method.getName();
        if (name.equals("setDataSource")) {
            objArr = beforeSetDataSource(objArr);
        }
        if (method.getReturnType().getName().equals("void")) {
            this.mSwitch.dealThreadSwitch(name, objArr);
            return null;
        }
        java.lang.Object dealThreadSwitchWithResult = this.mSwitch.dealThreadSwitchWithResult(name, objArr);
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.mPlayer.getTag(), "dealThreadSwitch: " + name + ", var count:" + getVarCount(objArr) + ", result:" + dealThreadSwitchWithResult);
        return dealThreadSwitchWithResult;
    }

    private int getVarCount(java.lang.Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    private boolean isNeedSwitchThread(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return com.tencent.thumbplayer.utils.TPThreadAnnotations.getMethod(this.mPlayer.getClass(), method.getName(), objArr) != null;
    }

    public java.lang.Object getProxyInstance() {
        return java.lang.reflect.Proxy.newProxyInstance(this.mPlayer.getClass().getClassLoader(), this.mPlayer.getClass().getInterfaces(), this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        return !isNeedSwitchThread(method, objArr) ? method.invoke(this.mPlayer, objArr) : dealThreadSwitch(method, objArr);
    }
}
