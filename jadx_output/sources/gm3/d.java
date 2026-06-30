package gm3;

/* loaded from: classes10.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList f273551d;

    public d(com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList) {
        this.f273551d = musicMvFlexLiveList;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = this.f273551d;
            musicMvFlexLiveList.A.e(kz5.n0.Q0(musicMvFlexLiveList.f152065o));
        }
    }
}
