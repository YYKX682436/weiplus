package hp;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.component.api.jumper.UICustomParam f282904a;

    public b() {
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        this.f282904a = uICustomParam;
        ((java.util.HashMap) uICustomParam.f64779h).put("plugin_filter", java.lang.Boolean.TRUE);
    }

    public hp.b a(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_emoji", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b b(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_filter", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b c(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_menu", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b d(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_music", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b e(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_poi", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b f(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_text", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b g(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_tip", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b h(boolean z17) {
        ((java.util.HashMap) this.f282904a.f64779h).put("plugin_video_crop", java.lang.Boolean.valueOf(z17));
        return this;
    }

    public hp.b i(int i17, int i18, java.lang.String str, int i19) {
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = this.f282904a;
        uICustomParam.f64780i = i17;
        uICustomParam.f64781m = i18;
        uICustomParam.f64783o = str;
        uICustomParam.f64782n = i19;
        return this;
    }
}
