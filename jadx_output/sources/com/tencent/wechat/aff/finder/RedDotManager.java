package com.tencent.wechat.aff.finder;

/* loaded from: classes8.dex */
public class RedDotManager extends com.tencent.wechat.zidl2.ClientInvoker {
    private static com.tencent.wechat.aff.finder.RedDotManager instance = new com.tencent.wechat.aff.finder.RedDotManager();

    public RedDotManager() {
        createClientInvoker("finder.RedDotManager@Get", null);
    }

    public static com.tencent.wechat.aff.finder.RedDotManager getInstance() {
        return instance;
    }

    public void addNewRedDotCtrlInfo(bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("addNewRedDotCtrlInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.addNewRedDotCtrlInfo failed", e17);
        }
    }

    public bw5.dv addNewRedDotCtrlInfoWithResult(boolean z17, bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("addNewRedDotCtrlInfoWithResult");
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            return (bw5.dv) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.dv.f26624i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.addNewRedDotCtrlInfoWithResult failed", e17);
        }
    }

    public boolean addSubAccountFinderRedDot(bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("addSubAccountFinderRedDot");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.addSubAccountFinderRedDot failed", e17);
        }
    }

    public boolean clearAllRedDotInfo() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearAllRedDotInfo");
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearAllRedDotInfo failed", e17);
        }
    }

    public java.util.ArrayList<java.lang.String> clearCtrlInfoWithCondition(java.lang.String str, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearCtrlInfoWithCondition");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBoolean(z17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readStringList();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearCtrlInfoWithCondition failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> clearRedDotByPathAndUuid(java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearRedDotByPathAndUuid");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeBoolean(z17);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearRedDotByPathAndUuid failed", e17);
        }
    }

    public void clearRedDotMockInfo() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearRedDotMockInfo");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearRedDotMockInfo failed", e17);
        }
    }

    public void clearSameRevokeIdCtrlInfo(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearSameRevokeIdCtrlInfo");
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearSameRevokeIdCtrlInfo failed", e17);
        }
    }

    public void clearSameTypeCtrlInfoType(int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearSameTypeCtrlInfoType");
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearSameTypeCtrlInfoType failed", e17);
        }
    }

    public java.util.ArrayList<java.lang.String> clearShowInfoByPathAndUuid(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, boolean z18) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("clearShowInfoByPathAndUuid");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeString(str3);
            invokerCodecEncoder.writeBoolean(z18);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readStringList();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.clearShowInfoByPathAndUuid failed", e17);
        }
    }

    public int ctrlInfoTypeAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("ctrlInfoTypeAtPath");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readUInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.ctrlInfoTypeAtPath failed", e17);
        }
    }

    public bw5.e0 ctrlInfoWithTipsUuid(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("ctrlInfoWithTipsUuid");
            invokerCodecEncoder.writeString(str);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.ctrlInfoWithTipsUuid failed", e17);
        }
    }

    public bw5.e0 ctrlInfoWithType(int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("ctrlInfoWithType");
            invokerCodecEncoder.writeUInt32(i17);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.ctrlInfoWithType failed", e17);
        }
    }

    public bw5.e0 currentCtrlInfoAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("currentCtrlInfoAtPath");
            invokerCodecEncoder.writeString(str);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.currentCtrlInfoAtPath failed", e17);
        }
    }

    public bw5.e0 currentCtrlInfoIgnoreAtPath(java.lang.String str, boolean z17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("currentCtrlInfoIgnoreAtPath");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBoolean(z17);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.currentCtrlInfoIgnoreAtPath failed", e17);
        }
    }

    public bw5.f0 currentShowInfoAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("currentShowInfoAtPath");
            invokerCodecEncoder.writeString(str);
            return (bw5.f0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.f0.f27101g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.currentShowInfoAtPath failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> disposeGroupTipsWithGroupId(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeGroupTipsWithGroupId");
            invokerCodecEncoder.writeString(str);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeGroupTipsWithGroupId failed", e17);
        }
    }

    public boolean disposeRedDotAtPath(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeRedDotAtPath");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeRedDotAtPath failed", e17);
        }
    }

    public void disposeRedDotByTipsUuid(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeRedDotByTipsUuid");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeRedDotByTipsUuid failed", e17);
        }
    }

    public boolean disposeRedDotByUuidOnly(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeRedDotByUuidOnly");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeRedDotByUuidOnly failed", e17);
        }
    }

    public boolean disposeRedDotIgnoreClearTypeAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeRedDotIgnoreClearTypeAtPath");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeRedDotIgnoreClearTypeAtPath failed", e17);
        }
    }

    public void disposeSubAccountFinderUsername(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("disposeSubAccountFinderUsername");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.disposeSubAccountFinderUsername failed", e17);
        }
    }

    public boolean dropTable(boolean z17, boolean z18) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("dropTable");
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeBoolean(z18);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.dropTable failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> getAllCurRedDotCtrlInfo() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllCurRedDotCtrlInfo");
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getAllCurRedDotCtrlInfo failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> getAllRedDotCtrlInfo() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllRedDotCtrlInfo");
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getAllRedDotCtrlInfo failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> getAllRedDotCtrlInfoAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllRedDotCtrlInfoAtPath");
            invokerCodecEncoder.writeString(str);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getAllRedDotCtrlInfoAtPath failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> getAllRedDotCtrlInfoAtType(int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getAllRedDotCtrlInfoAtType");
            invokerCodecEncoder.writeUInt32(i17);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getAllRedDotCtrlInfoAtType failed", e17);
        }
    }

    public bw5.e0 getCtrlInfoByFinderUsernamePath(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getCtrlInfoByFinderUsernamePath");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeString(str2);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getCtrlInfoByFinderUsernamePath failed", e17);
        }
    }

    public bw5.e0 getCtrlInfoByFinderUsernameType(java.lang.String str, int i17) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getCtrlInfoByFinderUsernameType");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeUInt32(i17);
            return (bw5.e0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytes());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getCtrlInfoByFinderUsernameType failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> getRedDotCtrlInfoListWithRevokeId(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("getRedDotCtrlInfoListWithRevokeId");
            invokerCodecEncoder.writeString(str);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.getRedDotCtrlInfoListWithRevokeId failed", e17);
        }
    }

    public void loadRedDotInfoFromDB(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("loadRedDotInfoFromDB");
            invokerCodecEncoder.writeString(str);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.loadRedDotInfoFromDB failed", e17);
        }
    }

    public java.util.ArrayList<bw5.dv> loadRedDotInfoFromDBWithResult(boolean z17, java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("loadRedDotInfoFromDBWithResult");
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeString(str);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.dv.f26624i, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.loadRedDotInfoFromDBWithResult failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> redDotDataByUsername(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("redDotDataByUsername");
            invokerCodecEncoder.writeString(str);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.redDotDataByUsername failed", e17);
        }
    }

    public void redDotInfoInvalidCheck() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("redDotInfoInvalidCheck");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.redDotInfoInvalidCheck failed", e17);
        }
    }

    public void resetAllRedDotData() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("resetAllRedDotData");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.resetAllRedDotData failed", e17);
        }
    }

    public void revokeRedDotByViewAction(int i17, int i18) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("revokeRedDotByViewAction");
            invokerCodecEncoder.writeUInt32(i17);
            invokerCodecEncoder.writeUInt32(i18);
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.revokeRedDotByViewAction failed", e17);
        }
    }

    public boolean revokeRedDotPathInfo(java.lang.String str, boolean z17, java.util.ArrayList<java.lang.String> arrayList) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("revokeRedDotPathInfo");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeStringList(arrayList);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.revokeRedDotPathInfo failed", e17);
        }
    }

    public java.util.ArrayList<bw5.e0> revokeRedDotPathInfoWithResult(java.lang.String str, boolean z17, java.util.ArrayList<java.lang.String> arrayList) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("revokeRedDotPathInfoWithResult");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBoolean(z17);
            invokerCodecEncoder.writeStringList(arrayList);
            return com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.e0.f26671g, new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBytesList());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.revokeRedDotPathInfoWithResult failed", e17);
        }
    }

    public void saveRedDotInfoToLocal() {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("saveRedDotInfoToLocal");
            invoke(invokerCodecEncoder.getByteBuffer());
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.saveRedDotInfoToLocal failed", e17);
        }
    }

    public boolean shouldShowRedDotAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("shouldShowRedDotAtPath");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.shouldShowRedDotAtPath failed", e17);
        }
    }

    public int showInfoTypeAtPath(java.lang.String str) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("showInfoTypeAtPath");
            invokerCodecEncoder.writeString(str);
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readUInt32();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.showInfoTypeAtPath failed", e17);
        }
    }

    public boolean syncCtrlInfo(bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("syncCtrlInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.syncCtrlInfo failed", e17);
        }
    }

    public boolean updateOrInsertFinderRedDotInfo(java.lang.String str, bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateOrInsertFinderRedDotInfo");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.updateOrInsertFinderRedDotInfo failed", e17);
        }
    }

    public boolean updateOrInsertFinderRedDotInfoList(java.lang.String str, java.util.ArrayList<bw5.e0> arrayList) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateOrInsertFinderRedDotInfoList");
            invokerCodecEncoder.writeString(str);
            invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(arrayList));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.updateOrInsertFinderRedDotInfoList failed", e17);
        }
    }

    public boolean updateOrInsertWXRedDotInfo(bw5.e0 e0Var) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateOrInsertWXRedDotInfo");
            invokerCodecEncoder.writeBytes(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(e0Var));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.updateOrInsertWXRedDotInfo failed", e17);
        }
    }

    public boolean updateOrInsertWXRedDotInfoList(java.util.ArrayList<bw5.e0> arrayList) {
        try {
            com.tencent.wechat.zidl2.InvokerCodecEncoder invokerCodecEncoder = new com.tencent.wechat.zidl2.InvokerCodecEncoder();
            invokerCodecEncoder.writeString(getClientId());
            invokerCodecEncoder.writeString("updateOrInsertWXRedDotInfoList");
            invokerCodecEncoder.writeBytesList(com.tencent.wechat.zidl2.ZidlUtil.mmpbSerialize(arrayList));
            return new com.tencent.wechat.zidl2.InvokerCodecDecoder(invoke(invokerCodecEncoder.getByteBuffer())).readBoolean();
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("RedDotManager.updateOrInsertWXRedDotInfoList failed", e17);
        }
    }
}
