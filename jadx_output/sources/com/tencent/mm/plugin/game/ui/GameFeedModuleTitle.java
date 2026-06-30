package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameFeedModuleTitle extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f140804d;

    public GameFeedModuleTitle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f140804d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gl6);
    }

    public void setData(com.tencent.mm.plugin.game.model.c cVar) {
        if (cVar == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar.f140237c)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            this.f140804d.setText(cVar.f140237c);
        }
    }
}
