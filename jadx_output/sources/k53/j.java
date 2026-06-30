package k53;

/* loaded from: classes8.dex */
public class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304366e;

    public j(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI, java.util.List list) {
        this.f304366e = gameVideoPreviewUI;
        this.f304365d = list;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304366e;
        gameVideoPreviewUI.f140115e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        k53.c0 c0Var = new k53.c0(gameVideoPreviewUI);
        gameVideoPreviewUI.f140116f = c0Var;
        gameVideoPreviewUI.f140115e.setAdapter(c0Var);
        k53.c0 c0Var2 = gameVideoPreviewUI.f140116f;
        c0Var2.getClass();
        java.util.List list = this.f304365d;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            c0Var2.f304346d.addAll(list);
            com.tencent.mm.sdk.platformtools.u3.i(new k53.t(c0Var2), 1000L);
        }
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI.T6(gameVideoPreviewUI, ((k53.c0) gameVideoPreviewUI.f140115e.getAdapter()).x(gameVideoPreviewUI.f140124q));
        androidx.recyclerview.widget.RecyclerView recyclerView = gameVideoPreviewUI.f140115e;
        int i17 = gameVideoPreviewUI.f140124q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI.U6(gameVideoPreviewUI, gameVideoPreviewUI.f140124q);
    }
}
