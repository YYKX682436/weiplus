package com.tencent.xweb.pinus;

/* loaded from: classes13.dex */
public class PSContextWrapper extends com.tencent.xweb.v1 {
    public int apkVersion;
    public boolean enableV8Lite;
    public java.lang.String extractedCoreDir;
    public int forceDarkBehavior;
    public boolean isForceDarkMode;
    public boolean usingCustomContext;

    public PSContextWrapper(android.content.Context context, int i17) {
        super(context);
        boolean z17 = false;
        this.apkVersion = 0;
        this.usingCustomContext = false;
        this.isForceDarkMode = false;
        this.forceDarkBehavior = 2;
        this.f220608d = context;
        this.f220611g = ((android.view.LayoutInflater) context.getApplicationContext().getSystemService("layout_inflater")).cloneInContext(this);
        this.apkVersion = i17;
        this.extractedCoreDir = by5.z3.f(i17);
        java.lang.String b17 = by5.z3.b(i17);
        boolean z18 = org.xwalk.core.XWalkEnvironment.f347975h;
        this.usingCustomContext = z18;
        if (z18) {
            this.f220609e = new com.tencent.xweb.w2(d(context, b17), context);
        } else {
            this.f220609e = d(context, b17);
        }
        by5.c4.f("PSContextWrapper", "usingCustomContext:" + this.usingCustomContext + ", resources:" + this.f220609e);
        java.lang.String str = org.xwalk.core.XWalkEnvironment.f347974g;
        java.util.Locale forLanguageTag = (str == null || str.isEmpty()) ? null : java.util.Locale.forLanguageTag(org.xwalk.core.XWalkEnvironment.f347974g);
        if (forLanguageTag != null) {
            by5.c4.f("PSContextWrapper", "updateResourceLocale, customize locale:" + forLanguageTag.toLanguageTag());
            e(forLanguageTag);
        }
        this.enableV8Lite = org.xwalk.core.XWalkEnvironment.f347978k;
        if (org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(1043)) {
            by5.c4.f("PSContextWrapper", "configure v8 lite supported, enableV8Lite:" + this.enableV8Lite);
        } else {
            by5.c4.f("PSContextWrapper", "configure v8 lite not supported");
        }
        if (org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_NEED_REENTER)) {
            z17 = true;
        }
        if (z17) {
            this.isForceDarkMode = org.xwalk.core.XWalkEnvironment.f347976i;
            this.forceDarkBehavior = org.xwalk.core.XWalkEnvironment.f347977j;
            by5.c4.f("PSContextWrapper", "force dark mode supported, isForceDarkMode:" + this.isForceDarkMode + ", forceDarkBehavior:" + this.forceDarkBehavior);
        } else {
            by5.c4.f("PSContextWrapper", "force dark mode not supported");
        }
        android.content.res.Resources resources = this.f220609e;
        if (resources == null || this.f220612h == null) {
            return;
        }
        this.f220610f = resources.newTheme();
        if (c(context, b17) != null) {
            android.content.res.Resources.Theme theme = context.getTheme();
            if (theme != null) {
                this.f220610f.setTo(theme);
            }
            this.f220610f.applyStyle(this.f220612h.theme, true);
        }
    }
}
