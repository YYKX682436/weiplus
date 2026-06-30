package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class AffNewLifeJumpInfoManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.newlife.AffNewLifeJumpInfoManager instance = new com.tencent.wechat.aff.newlife.AffNewLifeJumpInfoManager();

    public AffNewLifeJumpInfoManager() {
        createClientInvoker("newlife.AffNewLifeJumpInfoManager@Get", null);
    }

    public static com.tencent.wechat.aff.newlife.AffNewLifeJumpInfoManager getInstance() {
        return instance;
    }

    public boolean config(java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, boolean z19, boolean z27) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("config");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeBoolean(z18);
            invokerCodecEncoder.writeBoolean(z19);
            invokerCodecEncoder.writeBoolean(z27);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeJumpInfoManager.config failed", e17);
        }
    }
}
