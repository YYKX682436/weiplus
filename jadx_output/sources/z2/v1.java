package z2;

/* loaded from: classes11.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f469527a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f469528b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f469529c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Bundle f469530d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f469531e;

    public v1(java.lang.String str, java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr, boolean z17, int i17, android.os.Bundle bundle, java.util.Set set) {
        this.f469527a = str;
        this.f469528b = charSequence;
        this.f469529c = z17;
        this.f469530d = bundle;
        this.f469531e = set;
        if (i17 == 2 && !z17) {
            throw new java.lang.IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput a(z2.v1 v1Var) {
        java.util.Set set;
        android.app.RemoteInput.Builder addExtras = new android.app.RemoteInput.Builder(v1Var.f469527a).setLabel(v1Var.f469528b).setChoices(null).setAllowFreeFormInput(v1Var.f469529c).addExtras(v1Var.f469530d);
        if (android.os.Build.VERSION.SDK_INT >= 26 && (set = v1Var.f469531e) != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                z2.t1.d(addExtras, (java.lang.String) it.next(), true);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            z2.u1.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
