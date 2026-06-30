package xm3;

/* loaded from: classes4.dex */
public final class o0 implements a75.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f455365b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f455366c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f455367d;

    /* renamed from: e, reason: collision with root package name */
    public final int f455368e;

    public o0(java.util.List latestList, int i17, java.util.List diffActionList, java.util.List submitTypeList, int i18) {
        kotlin.jvm.internal.o.g(latestList, "latestList");
        kotlin.jvm.internal.o.g(diffActionList, "diffActionList");
        kotlin.jvm.internal.o.g(submitTypeList, "submitTypeList");
        this.f455364a = latestList;
        this.f455365b = i17;
        this.f455366c = diffActionList;
        this.f455367d = submitTypeList;
        this.f455368e = i18;
    }

    @Override // a75.a
    public java.lang.String getKey() {
        return "MvvmListPendingData";
    }

    @Override // a75.a
    public a75.a mergeEvent(a75.a newEvent) {
        kotlin.jvm.internal.o.g(newEvent, "newEvent");
        xm3.o0 o0Var = (xm3.o0) newEvent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f455367d);
        arrayList.addAll(o0Var.f455367d);
        return new xm3.o0(o0Var.f455364a, o0Var.f455365b, o0Var.f455366c, arrayList, this.f455368e + 1);
    }

    public /* synthetic */ o0(java.util.List list, int i17, java.util.List list2, java.util.List list3, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(list, i17, list2, list3, (i19 & 16) != 0 ? 0 : i18);
    }
}
