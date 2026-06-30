package com.tencent.wechat.aff.wenote;

/* loaded from: classes11.dex */
class ZIDL_jA0YjmIVB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.wenote.a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.wenote.b f217672a;

    private native void ZIDL_BX(long j17, long j18);

    public void Q1(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    public com.tencent.wechat.zidl2.ZidlObjHolder2 ZIDL_A(byte[] bArr) {
        com.tencent.wechat.aff.wenote.b bVar = this.f217672a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz4.c.f277763a;
        com.tencent.wechat.aff.wenote.h hVar = (com.tencent.wechat.aff.wenote.h) gz4.c.f277763a.get(str);
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeNoteCppToNativeSingletonImpl", "getWeNoteNativeHelperInstance: failed " + str + ' ');
            hVar = new com.tencent.wechat.aff.wenote.h(new dz4.j0(null));
        }
        return com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(hVar);
    }

    public void ZIDL_BV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.wenote.b bVar = this.f217672a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz4.c.f277763a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = gz4.c.f277763a;
        boolean z17 = ((com.tencent.wechat.aff.wenote.h) concurrentHashMap2.get(str)) != null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteCppToNativeSingletonImpl", "abandonWeNoteNativeHelperInstance: " + z17 + ", " + str);
        if (z17) {
            concurrentHashMap2.remove(str);
        }
        com.tencent.wechat.aff.wenote.a aVar = gz4.b.f277762b;
        if (aVar != null) {
            ((com.tencent.wechat.aff.wenote.ZIDL_jA0YjmIVB) aVar).Q1(j17);
        }
    }

    public byte[] ZIDL_C(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.wenote.b bVar = this.f217672a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((gz4.b) bVar).getClass();
        java.lang.String str3 = "";
        if (!(str.length() == 0)) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            switch (str.hashCode()) {
                case -1943382669:
                    if (str.equals("Fav_Node_WeApp_Title")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490010id);
                        break;
                    }
                    break;
                case -1700376596:
                    if (str.equals("Fav_Node_Name_CustomerService_ShareCard")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490446va);
                        break;
                    }
                    break;
                case -1643702965:
                    if (str.equals("WCFinder_Feed_Save_From_Someone")) {
                        str3 = context.getString(com.tencent.mm.R.string.pcs, str2);
                        break;
                    }
                    break;
                case -1181036344:
                    if (str.equals("Fav_Node_Name_Not_Support")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490505wz);
                        break;
                    }
                    break;
                case -1161822380:
                    if (str.equals("Fav_Node_Name_ShareCard")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490445v9);
                        break;
                    }
                    break;
                case -1115466889:
                    if (str.equals("Fav_Node_Name_Voice")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490600zm);
                        break;
                    }
                    break;
                case -343653716:
                    if (str.equals("Fav_Node_Name_Record")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490535xv);
                        break;
                    }
                    break;
                case 102326541:
                    if (str.equals("Fav_Node_Name_Note")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490506x0);
                        break;
                    }
                    break;
                case 1647537019:
                    if (str.equals("Fav_Node_Video_Title")) {
                        str3 = context.getString(com.tencent.mm.R.string.f490596zi);
                        break;
                    }
                    break;
            }
            kotlin.jvm.internal.o.d(str3);
        }
        return str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.wenote.b bVar = (com.tencent.wechat.aff.wenote.b) obj;
        this.f217672a = bVar;
        ((gz4.b) bVar).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteCppToNativeSingletonImpl", "setCallback: " + this);
        gz4.b.f277762b = this;
    }
}
