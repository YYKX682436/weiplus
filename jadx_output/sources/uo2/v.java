package uo2;

/* loaded from: classes2.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f429644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429644d = new java.util.HashMap();
    }

    public final void O6() {
        java.util.HashMap hashMap = this.f429644d;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((vo2.c) ((vo2.d) ((java.util.Map.Entry) it.next()).getValue())).e();
        }
        hashMap.clear();
    }

    public final void P6(com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.HashMap hashMap = this.f429644d;
        vo2.d dVar = (vo2.d) hashMap.get(view);
        if (dVar != null) {
            ((vo2.c) dVar).e();
        }
        hashMap.remove(view);
        com.tencent.mars.xlog.Log.i("FinderImgFeedMusicPlayer", view.getId() + " dettach, player size:" + hashMap.size());
    }

    public final com.tencent.mm.plugin.finder.view.image.FinderImageBanner Q6(android.view.View view) {
        android.view.ViewParent parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.f484869fs3) : null;
        if (findViewById instanceof com.tencent.mm.plugin.finder.view.image.FinderImageBanner) {
            return (com.tencent.mm.plugin.finder.view.image.FinderImageBanner) findViewById;
        }
        return null;
    }

    public final void R6(yz5.l lVar) {
        vo2.d dVar;
        for (java.util.Map.Entry entry : this.f429644d.entrySet()) {
            if (!(lVar != null ? ((java.lang.Boolean) lVar.invoke(entry.getKey())).booleanValue() : false)) {
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.o();
                }
                com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey();
                if (finderImgFeedMusicTag.musicInfo == null || (dVar = finderImgFeedMusicTag.player) == null) {
                    com.tencent.mars.xlog.Log.i("FinderImgFeedMusicTag", "[pauseMusicAuto] musicInfo = " + finderImgFeedMusicTag.musicInfo + ",player = " + finderImgFeedMusicTag.player);
                } else {
                    finderImgFeedMusicTag.isMusicFocused = false;
                    finderImgFeedMusicTag.shouldMusicResume = false;
                    finderImgFeedMusicTag.isMusicPauseManually = false;
                    if (((vo2.c) dVar).b() ? false : true) {
                        com.tencent.mars.xlog.Log.i("FinderImgFeedMusicTag", "[pauseMusicAuto] music paused");
                    } else if (finderImgFeedMusicTag.musicInfo != null) {
                        vo2.d dVar2 = finderImgFeedMusicTag.player;
                        if (dVar2 != null) {
                            ((vo2.c) dVar2).c();
                        }
                        finderImgFeedMusicTag.f();
                        finderImgFeedMusicTag.onPlayCallback.invoke(java.lang.Boolean.FALSE);
                    }
                }
            }
        }
    }

    public final void S6() {
        for (java.util.Map.Entry entry : this.f429644d.entrySet()) {
            if (((com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey()).isMusicFocused) {
                ((com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey()).setShouldMusicResume(((vo2.c) ((vo2.d) entry.getValue())).b());
                ((com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey()).d(false);
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.o();
                }
            }
        }
    }

    public final void T6() {
        for (java.util.Map.Entry entry : this.f429644d.entrySet()) {
            if (((com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey()).isMusicFocused && ((com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) entry.getKey()).getShouldMusicResume()) {
                ((vo2.c) ((vo2.d) entry.getValue())).d();
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner Q6 = Q6((android.view.View) entry.getKey());
                if (Q6 != null) {
                    Q6.m();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f429644d = new java.util.HashMap();
    }
}
