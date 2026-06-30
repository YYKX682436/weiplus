package jm3;

/* loaded from: classes10.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f300349e;

    public r0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, java.util.LinkedList linkedList) {
        this.f300348d = musicMvMakerUI;
        this.f300349e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300348d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = ((com.tencent.mm.plugin.mv.ui.uic.v4) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.v4.class)).f151491h;
        musicMvFlexLiveList.d(new jm3.q0(this.f300349e, musicMvFlexLiveList));
    }
}
