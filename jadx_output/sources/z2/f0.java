package z2;

/* loaded from: classes13.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f469436a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f469437b;

    /* renamed from: c, reason: collision with root package name */
    public final z2.v1[] f469438c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f469439d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f469440e;

    /* renamed from: f, reason: collision with root package name */
    public final int f469441f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f469442g;

    /* renamed from: h, reason: collision with root package name */
    public final int f469443h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.CharSequence f469444i;

    /* renamed from: j, reason: collision with root package name */
    public final android.app.PendingIntent f469445j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f469446k;

    public f0(int i17, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
        this(i17 != 0 ? androidx.core.graphics.drawable.IconCompat.e(null, "", i17) : null, charSequence, pendingIntent, new android.os.Bundle(), null, null, true, 0, true, false, false);
    }

    public androidx.core.graphics.drawable.IconCompat a() {
        int i17;
        if (this.f469437b == null && (i17 = this.f469443h) != 0) {
            this.f469437b = androidx.core.graphics.drawable.IconCompat.e(null, "", i17);
        }
        return this.f469437b;
    }

    public f0(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, z2.v1[] v1VarArr, z2.v1[] v1VarArr2, boolean z17, int i17, boolean z18, boolean z19, boolean z27) {
        this.f469440e = true;
        this.f469437b = iconCompat;
        if (iconCompat != null) {
            int i18 = iconCompat.f11037a;
            if ((i18 == -1 ? f3.e.c(iconCompat.f11038b) : i18) == 2) {
                this.f469443h = iconCompat.f();
            }
        }
        this.f469444i = z2.k0.c(charSequence);
        this.f469445j = pendingIntent;
        this.f469436a = bundle == null ? new android.os.Bundle() : bundle;
        this.f469438c = v1VarArr;
        this.f469439d = z17;
        this.f469441f = i17;
        this.f469440e = z18;
        this.f469442g = z19;
        this.f469446k = z27;
    }
}
