package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class AffNewLifeSyncManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.newlife.AffNewLifeSyncManager instance = new com.tencent.wechat.aff.newlife.AffNewLifeSyncManager();

    public AffNewLifeSyncManager() {
        createClientInvoker("newlife.AffNewLifeSyncManager@Get", null);
    }

    public static com.tencent.wechat.aff.newlife.AffNewLifeSyncManager getInstance() {
        return instance;
    }

    public void dispatchHandleCmdItem(java.util.ArrayList<com.tencent.wechat.aff.newlife.FinderCmdItem> arrayList, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dispatchHandleCmdItem");
            invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(arrayList));
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.dispatchHandleCmdItem failed", e17);
        }
    }

    public void doSync(int i17, int i18, java.lang.String str, int i19) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("doSync");
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt32(i18);
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i19);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.doSync failed", e17);
        }
    }

    public void doSyncWithConfig(int i17, int i18, int i19) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("doSyncWithConfig");
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt32(i18);
            invokerCodecEncoder.writeUInt32(i19);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeSyncManager.doSyncWithConfig failed", e17);
        }
    }
}
