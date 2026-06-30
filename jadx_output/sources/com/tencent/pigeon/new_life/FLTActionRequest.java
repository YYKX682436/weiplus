package com.tencent.pigeon.new_life;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/new_life/FLTActionRequest;", "", "cmdId", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, "Lcom/tencent/pigeon/new_life/FLTPlatformProto;", "(Ljava/lang/String;Lcom/tencent/pigeon/new_life/FLTPlatformProto;)V", "getCmdId", "()Ljava/lang/String;", "getProto", "()Lcom/tencent/pigeon/new_life/FLTPlatformProto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FLTActionRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.new_life.FLTActionRequest.Companion INSTANCE = new com.tencent.pigeon.new_life.FLTActionRequest.Companion(null);
    private final java.lang.String cmdId;
    private final com.tencent.pigeon.new_life.FLTPlatformProto proto;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/new_life/FLTActionRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/new_life/FLTActionRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.new_life.FLTActionRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(1);
            return new com.tencent.pigeon.new_life.FLTActionRequest(str, list2 != null ? com.tencent.pigeon.new_life.FLTPlatformProto.INSTANCE.fromList(list2) : null);
        }
    }

    public FLTActionRequest(java.lang.String cmdId, com.tencent.pigeon.new_life.FLTPlatformProto fLTPlatformProto) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        this.cmdId = cmdId;
        this.proto = fLTPlatformProto;
    }

    public static /* synthetic */ com.tencent.pigeon.new_life.FLTActionRequest copy$default(com.tencent.pigeon.new_life.FLTActionRequest fLTActionRequest, java.lang.String str, com.tencent.pigeon.new_life.FLTPlatformProto fLTPlatformProto, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = fLTActionRequest.cmdId;
        }
        if ((i17 & 2) != 0) {
            fLTPlatformProto = fLTActionRequest.proto;
        }
        return fLTActionRequest.copy(str, fLTPlatformProto);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCmdId() {
        return this.cmdId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.new_life.FLTPlatformProto getProto() {
        return this.proto;
    }

    public final com.tencent.pigeon.new_life.FLTActionRequest copy(java.lang.String cmdId, com.tencent.pigeon.new_life.FLTPlatformProto proto) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        return new com.tencent.pigeon.new_life.FLTActionRequest(cmdId, proto);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.new_life.FLTActionRequest)) {
            return false;
        }
        com.tencent.pigeon.new_life.FLTActionRequest fLTActionRequest = (com.tencent.pigeon.new_life.FLTActionRequest) other;
        return kotlin.jvm.internal.o.b(this.cmdId, fLTActionRequest.cmdId) && kotlin.jvm.internal.o.b(this.proto, fLTActionRequest.proto);
    }

    public final java.lang.String getCmdId() {
        return this.cmdId;
    }

    public final com.tencent.pigeon.new_life.FLTPlatformProto getProto() {
        return this.proto;
    }

    public int hashCode() {
        int hashCode = this.cmdId.hashCode() * 31;
        com.tencent.pigeon.new_life.FLTPlatformProto fLTPlatformProto = this.proto;
        return hashCode + (fLTPlatformProto == null ? 0 : fLTPlatformProto.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.cmdId;
        com.tencent.pigeon.new_life.FLTPlatformProto fLTPlatformProto = this.proto;
        objArr[1] = fLTPlatformProto != null ? fLTPlatformProto.toList() : null;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "FLTActionRequest(cmdId=" + this.cmdId + ", proto=" + this.proto + ')';
    }

    public /* synthetic */ FLTActionRequest(java.lang.String str, com.tencent.pigeon.new_life.FLTPlatformProto fLTPlatformProto, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? null : fLTPlatformProto);
    }
}
