package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class ReqHead extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ReqHead";
    static com.tencent.tmassistantsdk.protocol.jce.Net cache_net;
    static com.tencent.tmassistantsdk.protocol.jce.Terminal cache_terminal;
    public int assistantAPILevel;
    public int assistantVersionCode;
    public int cmdId;
    public byte encryptWithPack;
    public com.tencent.tmassistantsdk.protocol.jce.Net net;
    public java.lang.String phoneGuid;
    public java.lang.String qua;
    public int requestId;
    public com.tencent.tmassistantsdk.protocol.jce.Terminal terminal;

    public ReqHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.phoneGuid = "";
        this.qua = "";
        this.encryptWithPack = (byte) 0;
        this.terminal = null;
        this.assistantAPILevel = 0;
        this.assistantVersionCode = 0;
        this.net = null;
    }

    public java.lang.String className() {
        return "jce.ReqHead";
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display(this.requestId, "requestId");
        jceDisplayer.display(this.cmdId, "cmdId");
        jceDisplayer.display(this.phoneGuid, "phoneGuid");
        jceDisplayer.display(this.qua, "qua");
        jceDisplayer.display(this.encryptWithPack, "encryptWithPack");
        jceDisplayer.display((com.qq.taf.jce.JceStruct) this.terminal, "terminal");
        jceDisplayer.display(this.assistantAPILevel, "assistantAPILevel");
        jceDisplayer.display(this.assistantVersionCode, "assistantVersionCode");
        jceDisplayer.display((com.qq.taf.jce.JceStruct) this.net, "net");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.requestId, true);
        jceDisplayer.displaySimple(this.cmdId, true);
        jceDisplayer.displaySimple(this.phoneGuid, true);
        jceDisplayer.displaySimple(this.qua, true);
        jceDisplayer.displaySimple(this.encryptWithPack, true);
        jceDisplayer.displaySimple((com.qq.taf.jce.JceStruct) this.terminal, true);
        jceDisplayer.displaySimple(this.assistantAPILevel, true);
        jceDisplayer.displaySimple(this.assistantVersionCode, true);
        jceDisplayer.displaySimple((com.qq.taf.jce.JceStruct) this.net, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.ReqHead reqHead = (com.tencent.tmassistantsdk.protocol.jce.ReqHead) obj;
        return com.qq.taf.jce.JceUtil.equals(this.requestId, reqHead.requestId) && com.qq.taf.jce.JceUtil.equals(this.cmdId, reqHead.cmdId) && com.qq.taf.jce.JceUtil.equals(this.phoneGuid, reqHead.phoneGuid) && com.qq.taf.jce.JceUtil.equals(this.qua, reqHead.qua) && com.qq.taf.jce.JceUtil.equals(this.encryptWithPack, reqHead.encryptWithPack) && com.qq.taf.jce.JceUtil.equals(this.terminal, reqHead.terminal) && com.qq.taf.jce.JceUtil.equals(this.assistantAPILevel, reqHead.assistantAPILevel) && com.qq.taf.jce.JceUtil.equals(this.assistantVersionCode, reqHead.assistantVersionCode) && com.qq.taf.jce.JceUtil.equals(this.net, reqHead.net);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public int getAssistantAPILevel() {
        return this.assistantAPILevel;
    }

    public int getAssistantVersionCode() {
        return this.assistantVersionCode;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public byte getEncryptWithPack() {
        return this.encryptWithPack;
    }

    public com.tencent.tmassistantsdk.protocol.jce.Net getNet() {
        return this.net;
    }

    public java.lang.String getPhoneGuid() {
        return this.phoneGuid;
    }

    public java.lang.String getQua() {
        return this.qua;
    }

    public int getRequestId() {
        return this.requestId;
    }

    public com.tencent.tmassistantsdk.protocol.jce.Terminal getTerminal() {
        return this.terminal;
    }

    public int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.requestId = jceInputStream.read(this.requestId, 0, true);
        this.cmdId = jceInputStream.read(this.cmdId, 1, true);
        this.phoneGuid = jceInputStream.readString(2, true);
        this.qua = jceInputStream.readString(3, true);
        this.encryptWithPack = jceInputStream.read(this.encryptWithPack, 4, false);
        if (cache_terminal == null) {
            cache_terminal = new com.tencent.tmassistantsdk.protocol.jce.Terminal();
        }
        this.terminal = (com.tencent.tmassistantsdk.protocol.jce.Terminal) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_terminal, 5, false);
        this.assistantAPILevel = jceInputStream.read(this.assistantAPILevel, 6, false);
        this.assistantVersionCode = jceInputStream.read(this.assistantVersionCode, 7, false);
        if (cache_net == null) {
            cache_net = new com.tencent.tmassistantsdk.protocol.jce.Net();
        }
        this.net = (com.tencent.tmassistantsdk.protocol.jce.Net) jceInputStream.read((com.qq.taf.jce.JceStruct) cache_net, 8, false);
    }

    public void setAssistantAPILevel(int i17) {
        this.assistantAPILevel = i17;
    }

    public void setAssistantVersionCode(int i17) {
        this.assistantVersionCode = i17;
    }

    public void setCmdId(int i17) {
        this.cmdId = i17;
    }

    public void setEncryptWithPack(byte b17) {
        this.encryptWithPack = b17;
    }

    public void setNet(com.tencent.tmassistantsdk.protocol.jce.Net net) {
        this.net = net;
    }

    public void setPhoneGuid(java.lang.String str) {
        this.phoneGuid = str;
    }

    public void setQua(java.lang.String str) {
        this.qua = str;
    }

    public void setRequestId(int i17) {
        this.requestId = i17;
    }

    public void setTerminal(com.tencent.tmassistantsdk.protocol.jce.Terminal terminal) {
        this.terminal = terminal;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.phoneGuid, 2);
        jceOutputStream.write(this.qua, 3);
        jceOutputStream.write(this.encryptWithPack, 4);
        com.tencent.tmassistantsdk.protocol.jce.Terminal terminal = this.terminal;
        if (terminal != null) {
            jceOutputStream.write((com.qq.taf.jce.JceStruct) terminal, 5);
        }
        jceOutputStream.write(this.assistantAPILevel, 6);
        jceOutputStream.write(this.assistantVersionCode, 7);
        com.tencent.tmassistantsdk.protocol.jce.Net net = this.net;
        if (net != null) {
            jceOutputStream.write((com.qq.taf.jce.JceStruct) net, 8);
        }
    }

    public ReqHead(int i17, int i18, java.lang.String str, java.lang.String str2, byte b17, com.tencent.tmassistantsdk.protocol.jce.Terminal terminal, int i19, int i27, com.tencent.tmassistantsdk.protocol.jce.Net net) {
        this.requestId = i17;
        this.cmdId = i18;
        this.phoneGuid = str;
        this.qua = str2;
        this.encryptWithPack = b17;
        this.terminal = terminal;
        this.assistantAPILevel = i19;
        this.assistantVersionCode = i27;
        this.net = net;
    }
}
