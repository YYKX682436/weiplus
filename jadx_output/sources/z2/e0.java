package z2;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.core.graphics.drawable.IconCompat f469422a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f469423b;

    /* renamed from: c, reason: collision with root package name */
    public final android.app.PendingIntent f469424c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f469425d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f469426e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f469427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469428g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f469429h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f469430i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f469431j;

    public e0(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
    }

    public z2.f0 a() {
        java.util.Set set;
        if (this.f469430i && this.f469424c == null) {
            throw new java.lang.NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.f469427f;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                z2.v1 v1Var = (z2.v1) it.next();
                if ((v1Var.f469529c || (set = v1Var.f469531e) == null || set.isEmpty()) ? false : true) {
                    arrayList.add(v1Var);
                } else {
                    arrayList2.add(v1Var);
                }
            }
        }
        return new z2.f0(this.f469422a, this.f469423b, this.f469424c, this.f469426e, arrayList2.isEmpty() ? null : (z2.v1[]) arrayList2.toArray(new z2.v1[arrayList2.size()]), arrayList.isEmpty() ? null : (z2.v1[]) arrayList.toArray(new z2.v1[arrayList.size()]), this.f469425d, this.f469428g, this.f469429h, this.f469430i, this.f469431j);
    }

    public e0(int i17, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i17 != 0 ? androidx.core.graphics.drawable.IconCompat.e(null, "", i17) : null, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
    }

    public e0(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, z2.v1[] v1VarArr, boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        this.f469425d = true;
        this.f469429h = true;
        this.f469422a = iconCompat;
        this.f469423b = z2.k0.c(charSequence);
        this.f469424c = pendingIntent;
        this.f469426e = bundle;
        this.f469427f = v1VarArr == null ? null : new java.util.ArrayList(java.util.Arrays.asList(v1VarArr));
        this.f469425d = z17;
        this.f469428g = i17;
        this.f469429h = z18;
        this.f469430i = z19;
        this.f469431j = z27;
    }
}
