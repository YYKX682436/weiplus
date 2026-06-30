package p13;

/* loaded from: classes12.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f351093a;

    /* renamed from: b, reason: collision with root package name */
    public p13.r f351094b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f351095c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f351096d;

    /* renamed from: g, reason: collision with root package name */
    public float f351099g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f351100h;

    /* renamed from: e, reason: collision with root package name */
    public p13.g f351097e = p13.g.Foreground;

    /* renamed from: f, reason: collision with root package name */
    public int f351098f = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f351101i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.CharSequence f351102j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f351103k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f351104l = "";

    public static final p13.i a(java.lang.CharSequence charSequence, java.lang.String str, boolean z17, boolean z18) {
        p13.i iVar = new p13.i();
        iVar.f351093a = charSequence;
        iVar.f351094b = p13.r.b(str, false);
        iVar.f351095c = z17;
        iVar.f351096d = z18;
        return iVar;
    }

    public static final p13.i b(java.lang.CharSequence charSequence, p13.r rVar) {
        p13.i iVar = new p13.i();
        iVar.f351093a = charSequence;
        iVar.f351094b = rVar;
        return iVar;
    }

    public static final p13.i c(java.lang.CharSequence charSequence, p13.r rVar, float f17, android.text.TextPaint textPaint) {
        return e(charSequence, rVar, false, false, f17, textPaint);
    }

    public static final p13.i d(java.lang.CharSequence charSequence, p13.r rVar, boolean z17, boolean z18) {
        return e(charSequence, rVar, z17, z18, 0.0f, null);
    }

    public static final p13.i e(java.lang.CharSequence charSequence, p13.r rVar, boolean z17, boolean z18, float f17, android.text.TextPaint textPaint) {
        p13.i iVar = new p13.i();
        iVar.f351093a = charSequence;
        iVar.f351094b = rVar;
        iVar.f351095c = z17;
        iVar.f351096d = z18;
        iVar.f351099g = f17;
        iVar.f351100h = textPaint;
        return iVar;
    }
}
