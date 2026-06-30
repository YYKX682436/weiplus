package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/MinimizeParams;", "", "showAlertIfNoPermission", "", "needPop", "needAnimation", "(ZZZ)V", "getNeedAnimation", "()Z", "getNeedPop", "getShowAlertIfNoPermission", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MinimizeParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.MinimizeParams.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.MinimizeParams.Companion(null);
    private final boolean needAnimation;
    private final boolean needPop;
    private final boolean showAlertIfNoPermission;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/MinimizeParams$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/MinimizeParams;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.MinimizeParams fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_voip.MinimizeParams(booleanValue, booleanValue2, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public MinimizeParams(boolean z17, boolean z18, boolean z19) {
        this.showAlertIfNoPermission = z17;
        this.needPop = z18;
        this.needAnimation = z19;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.MinimizeParams copy$default(com.tencent.pigeon.flutter_voip.MinimizeParams minimizeParams, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = minimizeParams.showAlertIfNoPermission;
        }
        if ((i17 & 2) != 0) {
            z18 = minimizeParams.needPop;
        }
        if ((i17 & 4) != 0) {
            z19 = minimizeParams.needAnimation;
        }
        return minimizeParams.copy(z17, z18, z19);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowAlertIfNoPermission() {
        return this.showAlertIfNoPermission;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getNeedPop() {
        return this.needPop;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedAnimation() {
        return this.needAnimation;
    }

    public final com.tencent.pigeon.flutter_voip.MinimizeParams copy(boolean showAlertIfNoPermission, boolean needPop, boolean needAnimation) {
        return new com.tencent.pigeon.flutter_voip.MinimizeParams(showAlertIfNoPermission, needPop, needAnimation);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.MinimizeParams)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.MinimizeParams minimizeParams = (com.tencent.pigeon.flutter_voip.MinimizeParams) other;
        return this.showAlertIfNoPermission == minimizeParams.showAlertIfNoPermission && this.needPop == minimizeParams.needPop && this.needAnimation == minimizeParams.needAnimation;
    }

    public final boolean getNeedAnimation() {
        return this.needAnimation;
    }

    public final boolean getNeedPop() {
        return this.needPop;
    }

    public final boolean getShowAlertIfNoPermission() {
        return this.showAlertIfNoPermission;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.showAlertIfNoPermission) * 31) + java.lang.Boolean.hashCode(this.needPop)) * 31) + java.lang.Boolean.hashCode(this.needAnimation);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.showAlertIfNoPermission), java.lang.Boolean.valueOf(this.needPop), java.lang.Boolean.valueOf(this.needAnimation));
    }

    public java.lang.String toString() {
        return "MinimizeParams(showAlertIfNoPermission=" + this.showAlertIfNoPermission + ", needPop=" + this.needPop + ", needAnimation=" + this.needAnimation + ')';
    }
}
