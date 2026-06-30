package xm3;

/* loaded from: classes.dex */
public final class e implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MMSearchLiveList f455305d;

    public e(com.tencent.mm.plugin.mvvmlist.MMSearchLiveList mMSearchLiveList) {
        this.f455305d = mMSearchLiveList;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.ArrayList arrayList = ((ym3.d) obj).f463149c;
        com.tencent.mm.plugin.mvvmlist.MMSearchLiveList mMSearchLiveList = this.f455305d;
        com.tencent.mm.plugin.mvvmlist.MvvmList.w(mMSearchLiveList, arrayList, false, 2, null);
        mMSearchLiveList.B = null;
        return jz5.f0.f302826a;
    }
}
