package zv0;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f476181a;

    /* renamed from: b, reason: collision with root package name */
    public final zv0.g0 f476182b;

    /* renamed from: c, reason: collision with root package name */
    public final zv0.n0 f476183c;

    public h0(java.util.List infoList, zv0.g0 selectedIndexPack, zv0.n0 updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        this.f476181a = infoList;
        this.f476182b = selectedIndexPack;
        this.f476183c = updateState;
    }

    public static /* synthetic */ zv0.h0 b(zv0.h0 h0Var, java.util.List list, zv0.g0 g0Var, zv0.n0 n0Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = h0Var.f476181a;
        }
        if ((i17 & 2) != 0) {
            g0Var = h0Var.f476182b;
        }
        if ((i17 & 4) != 0) {
            n0Var = h0Var.f476183c;
        }
        return h0Var.a(list, g0Var, n0Var);
    }

    public final zv0.h0 a(java.util.List infoList, zv0.g0 selectedIndexPack, zv0.n0 updateState) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(selectedIndexPack, "selectedIndexPack");
        kotlin.jvm.internal.o.g(updateState, "updateState");
        return new zv0.h0(infoList, selectedIndexPack, updateState);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.h0)) {
            return false;
        }
        zv0.h0 h0Var = (zv0.h0) obj;
        return kotlin.jvm.internal.o.b(this.f476181a, h0Var.f476181a) && kotlin.jvm.internal.o.b(this.f476182b, h0Var.f476182b) && kotlin.jvm.internal.o.b(this.f476183c, h0Var.f476183c);
    }

    public int hashCode() {
        return (((this.f476181a.hashCode() * 31) + this.f476182b.hashCode()) * 31) + this.f476183c.hashCode();
    }

    public java.lang.String toString() {
        return "TransitionUiState(infoList=" + this.f476181a + ", selectedIndexPack=" + this.f476182b + ", updateState=" + this.f476183c + ')';
    }

    public /* synthetic */ h0(java.util.List list, zv0.g0 g0Var, zv0.n0 n0Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list, (i17 & 2) != 0 ? new zv0.g0(-1, -1) : g0Var, (i17 & 4) != 0 ? zv0.i0.f476189a : n0Var);
    }
}
