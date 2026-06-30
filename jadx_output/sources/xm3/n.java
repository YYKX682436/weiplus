package xm3;

/* loaded from: classes4.dex */
public final class n implements a75.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f455355a;

    public n(com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f455355a = mvvmList;
    }

    @Override // a75.b
    public void handleEvent(java.util.List eventList) {
        kotlin.jvm.internal.o.g(eventList, "eventList");
        pm0.v.X(new xm3.m(eventList, this.f455355a));
    }
}
