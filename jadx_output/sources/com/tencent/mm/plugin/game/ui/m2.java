package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class m2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView f141470d;

    public m2(com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView gameDetailAutoScrollView) {
        this.f141470d = gameDetailAutoScrollView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView gameDetailAutoScrollView = this.f141470d;
        int i17 = gameDetailAutoScrollView.f140730e;
        java.util.ArrayList arrayList = gameDetailAutoScrollView.f140729d;
        if (i17 < (arrayList.size() / 2) - 1) {
            gameDetailAutoScrollView.f140730e++;
        } else {
            gameDetailAutoScrollView.f140730e = 0;
        }
        java.lang.String str = (java.lang.String) arrayList.get(gameDetailAutoScrollView.f140730e * 2);
        java.lang.String str2 = (java.lang.String) arrayList.get((gameDetailAutoScrollView.f140730e * 2) + 1);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = gameDetailAutoScrollView.getContext();
        float textSize = gameDetailAutoScrollView.f140735m.getTextSize();
        ((ke0.e) xVar).getClass();
        gameDetailAutoScrollView.f140735m.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        gameDetailAutoScrollView.f140736n.setText(str2);
        gameDetailAutoScrollView.f140731f.startAnimation(gameDetailAutoScrollView.f140738p);
        gameDetailAutoScrollView.f140731f.setVisibility(8);
        gameDetailAutoScrollView.f140734i.startAnimation(gameDetailAutoScrollView.f140737o);
        gameDetailAutoScrollView.f140734i.setVisibility(0);
        android.view.ViewGroup viewGroup = gameDetailAutoScrollView.f140731f;
        gameDetailAutoScrollView.f140731f = gameDetailAutoScrollView.f140734i;
        gameDetailAutoScrollView.f140734i = viewGroup;
        android.widget.TextView textView = gameDetailAutoScrollView.f140732g;
        gameDetailAutoScrollView.f140732g = gameDetailAutoScrollView.f140735m;
        gameDetailAutoScrollView.f140735m = textView;
        android.widget.TextView textView2 = gameDetailAutoScrollView.f140733h;
        gameDetailAutoScrollView.f140733h = gameDetailAutoScrollView.f140736n;
        gameDetailAutoScrollView.f140736n = textView2;
        return true;
    }
}
