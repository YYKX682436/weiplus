package com.tencent.mm.plugin.mv.ui.open.text_status;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsView;", "Landroid/widget/RelativeLayout;", "", "lyric", "Ljz5/f0;", "setupLyricContent", "", "currentPos", "setupCurrentTime", "Lom3/i;", "d", "Ljz5/g;", "getLyricManager", "()Lom3/i;", "lyricManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TingMusicLyricsView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g lyricManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingMusicLyricsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.d0h, this);
        this.lyricManager = jz5.h.b(new om3.f(context, this));
    }

    private final om3.i getLyricManager() {
        return (om3.i) ((jz5.n) this.lyricManager).getValue();
    }

    public final void a() {
        om3.i lyricManager = getLyricManager();
        lyricManager.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Ting.TingMusicLyricsViewManager", "onCreate" + kl3.t.g().a());
        lyricManager.a().setLayoutManager(new com.tencent.mm.plugin.mv.ui.adapter.MusicLyricLayoutManager(lyricManager.f346404a, 0, false, 6, null));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) lyricManager.a().getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        android.content.Context context = lyricManager.f346404a;
        marginLayoutParams.topMargin = (int) ((context.getResources().getDisplayMetrics().heightPixels * 0.37f) - i65.a.b(context, 15));
    }

    public final void b() {
        om3.i lyricManager = getLyricManager();
        lyricManager.f346407d.clear();
        lyricManager.f346408e = null;
    }

    public final void setupCurrentTime(int i17) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        om3.i lyricManager = getLyricManager();
        int i18 = lyricManager.f346409f;
        ll3.h1 h1Var = lyricManager.f346408e;
        if (h1Var != null) {
            i18 = h1Var.a(i17);
        }
        if (i18 != lyricManager.f346409f && i18 >= 0 && (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) lyricManager.a().getLayoutManager()) != null) {
            int w17 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            lyricManager.a().f1();
            if (i18 <= y17 + 1 && w17 - 1 <= i18) {
                androidx.recyclerview.widget.RecyclerView a17 = lyricManager.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                a17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            } else {
                androidx.recyclerview.widget.RecyclerView a18 = lyricManager.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(a18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                a18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(a18, "com/tencent/mm/plugin/mv/ui/open/text_status/TingMusicLyricsViewManager", "setCurrentTime", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        lyricManager.f346409f = i18;
    }

    public final void setupLyricContent(java.lang.String lyric) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        om3.i lyricManager = getLyricManager();
        lyricManager.getClass();
        if (!(lyric.length() > 0)) {
            lyric = null;
        }
        if (lyric != null) {
            java.util.ArrayList arrayList = lyricManager.f346407d;
            arrayList.clear();
            ll3.h1 f17 = ll3.h1.f(lyric, "", "", true, "", false, false);
            ll3.h1 h1Var = f17.e() > 1 ? f17 : null;
            lyricManager.f346408e = h1Var;
            if (h1Var != null) {
                int e17 = h1Var.e();
                for (int i17 = 0; i17 < e17; i17++) {
                    java.lang.String str = h1Var.d(i17).f319168b;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
            }
            if (((km3.d) lyricManager.a().getAdapter()) == null) {
                androidx.recyclerview.widget.RecyclerView a17 = lyricManager.a();
                km3.d dVar = new km3.d(lyricManager.f346410g);
                dVar.x(arrayList);
                a17.setAdapter(dVar);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Ting.TingMusicLyricsViewManager", "setSongInfo, lyric.length:" + lyric.length() + ", lyricLine.size:" + arrayList.size() + ", lyricRv-Visisble:" + lyricManager.a().getVisibility() + ", lyricRv.alpha:" + lyricManager.a().getAlpha());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingMusicLyricsView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingMusicLyricsView(android.content.Context context) {
        this(context, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
