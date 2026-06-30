package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AcceptParams;", "", "needSwitchToVoice", "", "(Z)V", "getNeedSwitchToVoice", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AcceptParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.AcceptParams.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.AcceptParams.Companion(null);
    private final boolean needSwitchToVoice;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AcceptParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/AcceptParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.AcceptParams fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_voip.AcceptParams(((java.lang.Boolean) obj).booleanValue());
        }
    }

    public AcceptParams(boolean z17) {
        this.needSwitchToVoice = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.AcceptParams copy$default(com.tencent.pigeon.flutter_voip.AcceptParams acceptParams, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = acceptParams.needSwitchToVoice;
        }
        return acceptParams.copy(z17);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getNeedSwitchToVoice() {
        return this.needSwitchToVoice;
    }

    public final com.tencent.pigeon.flutter_voip.AcceptParams copy(boolean needSwitchToVoice) {
        return new com.tencent.pigeon.flutter_voip.AcceptParams(needSwitchToVoice);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.flutter_voip.AcceptParams) && this.needSwitchToVoice == ((com.tencent.pigeon.flutter_voip.AcceptParams) other).needSwitchToVoice;
    }

    public final boolean getNeedSwitchToVoice() {
        return this.needSwitchToVoice;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.needSwitchToVoice);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(java.lang.Boolean.valueOf(this.needSwitchToVoice));
    }

    public java.lang.String toString() {
        return "AcceptParams(needSwitchToVoice=" + this.needSwitchToVoice + ')';
    }
}
