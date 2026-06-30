package com.tencent.mm.plugin.game.ui;

/* loaded from: classes.dex */
public class GameBestSellingTitle extends android.widget.LinearLayout {
    public GameBestSellingTitle(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setText(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            setVisibility(8);
        } else {
            setVisibility(0);
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.git)).setText(str);
        }
    }
}
