package fn4;

/* loaded from: classes3.dex */
public abstract class h extends com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar {
    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        setBackgroundColor(android.graphics.Color.parseColor("#40000000"));
    }

    public void setCurrentPlaySecond(int i17) {
        int barLen;
        this.f162480p = i17;
        this.f162477m.setText(k(i17 / 60) + ":" + k(i17 % 60));
        if (i17 <= 0) {
            barLen = 0;
        } else {
            int i18 = this.f162479o;
            barLen = i17 >= i18 ? getBarLen() : (int) (((i17 * 1.0d) / i18) * getBarLen());
        }
        v(barLen);
    }

    public abstract void w();

    public abstract void x();
}
