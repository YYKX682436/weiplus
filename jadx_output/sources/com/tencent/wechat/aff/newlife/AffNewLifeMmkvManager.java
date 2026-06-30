package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class AffNewLifeMmkvManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.newlife.AffNewLifeMmkvManager instance = new com.tencent.wechat.aff.newlife.AffNewLifeMmkvManager();

    public AffNewLifeMmkvManager() {
        createClientInvoker("newlife.AffNewLifeMmkvManager@Get", null);
    }

    public static com.tencent.wechat.aff.newlife.AffNewLifeMmkvManager getInstance() {
        return instance;
    }

    public boolean getBoolSync(java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetBoolSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeBoolean(z17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getBoolSync failed", e17);
        }
    }

    public int getInt32Sync(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetInt32Sync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getInt32Sync failed", e17);
        }
    }

    public long getLongSync(java.lang.String str, java.lang.String str2, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetLongSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeUInt64(j17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readUInt64();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getLongSync failed", e17);
        }
    }

    public com.tencent.wechat.aff.newlife.NewLifeConfig getNewLifeConfig() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetNewLifeConfig");
            return (com.tencent.wechat.aff.newlife.NewLifeConfig) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.newlife.NewLifeConfig.getDefaultInstance(), new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getNewLifeConfig failed", e17);
        }
    }

    public long getPrepareAttr(java.lang.String str, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetPrepareAttr");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt64(j17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readUInt64();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getPrepareAttr failed", e17);
        }
    }

    public java.lang.String getStringSync(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("GetStringSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeString(str3);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readString();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.getStringSync failed", e17);
        }
    }

    public boolean savePrepareAttr(java.lang.String str, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("SavePrepareAttr");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt64(j17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.savePrepareAttr failed", e17);
        }
    }

    public boolean setBoolSync(java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("SetBoolSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeBoolean(z17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.setBoolSync failed", e17);
        }
    }

    public boolean setInt32Sync(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("SetInt32Sync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.setInt32Sync failed", e17);
        }
    }

    public boolean setLongSync(java.lang.String str, java.lang.String str2, long j17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("SetLongSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeUInt64(j17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.setLongSync failed", e17);
        }
    }

    public boolean setStringSync(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("SetStringSync");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeString(str3);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.setStringSync failed", e17);
        }
    }

    public boolean updateNewLifeConfig(com.tencent.wechat.aff.newlife.NewLifeConfig newLifeConfig) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("UpdateNewLifeConfig");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(newLifeConfig));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("AffNewLifeMmkvManager.updateNewLifeConfig failed", e17);
        }
    }
}
