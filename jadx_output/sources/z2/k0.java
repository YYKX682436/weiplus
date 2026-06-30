package z2;

/* loaded from: classes13.dex */
public class k0 {
    public long A;
    public final boolean C;
    public final android.app.Notification D;
    public boolean E;
    public final java.util.ArrayList F;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f469457a;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f469461e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f469462f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.PendingIntent f469463g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.PendingIntent f469464h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.core.graphics.drawable.IconCompat f469465i;

    /* renamed from: j, reason: collision with root package name */
    public int f469466j;

    /* renamed from: l, reason: collision with root package name */
    public z2.s0 f469468l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.CharSequence f469469m;

    /* renamed from: n, reason: collision with root package name */
    public int f469470n;

    /* renamed from: o, reason: collision with root package name */
    public int f469471o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f469472p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469473q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f469475s;

    /* renamed from: t, reason: collision with root package name */
    public android.os.Bundle f469476t;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RemoteViews f469479w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.RemoteViews f469480x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RemoteViews f469481y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f469482z;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f469458b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f469459c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f469460d = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f469467k = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f469474r = false;

    /* renamed from: u, reason: collision with root package name */
    public int f469477u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f469478v = 0;
    public int B = 0;

    public k0(android.content.Context context, java.lang.String str) {
        android.app.Notification notification = new android.app.Notification();
        this.D = notification;
        this.f469457a = context;
        this.f469482z = str;
        notification.when = java.lang.System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f469466j = 0;
        this.F = new java.util.ArrayList();
        this.C = true;
    }

    public static java.lang.CharSequence c(java.lang.CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public z2.k0 a(z2.f0 f0Var) {
        if (f0Var != null) {
            this.f469458b.add(f0Var);
        }
        return this;
    }

    public android.app.Notification b() {
        android.app.Notification notification;
        android.os.Bundle bundle;
        android.widget.RemoteViews f17;
        android.widget.RemoteViews d17;
        z2.e1 e1Var = new z2.e1(this);
        z2.k0 k0Var = e1Var.f469433b;
        z2.s0 s0Var = k0Var.f469468l;
        if (s0Var != null) {
            s0Var.b(e1Var);
        }
        android.widget.RemoteViews e17 = s0Var != null ? s0Var.e(e1Var) : null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.app.Notification.Builder builder = e1Var.f469432a;
        if (i17 >= 26) {
            notification = z2.t0.a(builder);
        } else {
            android.app.Notification a17 = z2.t0.a(builder);
            int i18 = e1Var.f469435d;
            if (i18 != 0) {
                if (z2.w0.f(a17) != null && (a17.flags & 512) != 0 && i18 == 2) {
                    a17.sound = null;
                    a17.vibrate = null;
                    a17.defaults = a17.defaults & (-2) & (-3);
                }
                if (z2.w0.f(a17) != null && (a17.flags & 512) == 0 && i18 == 1) {
                    a17.sound = null;
                    a17.vibrate = null;
                    a17.defaults = a17.defaults & (-2) & (-3);
                }
            }
            notification = a17;
        }
        if (e17 != null) {
            notification.contentView = e17;
        } else {
            android.widget.RemoteViews remoteViews = k0Var.f469479w;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
        }
        if (s0Var != null && (d17 = s0Var.d(e1Var)) != null) {
            notification.bigContentView = d17;
        }
        if (s0Var != null && (f17 = k0Var.f469468l.f(e1Var)) != null) {
            notification.headsUpContentView = f17;
        }
        if (s0Var != null && (bundle = notification.extras) != null) {
            s0Var.a(bundle);
        }
        return notification;
    }

    public z2.k0 d(boolean z17) {
        h(16, z17);
        return this;
    }

    public z2.k0 e(java.lang.CharSequence charSequence) {
        this.f469462f = c(charSequence);
        return this;
    }

    public z2.k0 f(java.lang.CharSequence charSequence) {
        this.f469461e = c(charSequence);
        return this;
    }

    public z2.k0 g(int i17) {
        android.app.Notification notification = this.D;
        notification.defaults = i17;
        if ((i17 & 4) != 0) {
            notification.flags |= 1;
        }
        return this;
    }

    public final void h(int i17, boolean z17) {
        android.app.Notification notification = this.D;
        if (z17) {
            notification.flags = i17 | notification.flags;
        } else {
            notification.flags = (~i17) & notification.flags;
        }
    }

    public z2.k0 i(android.app.PendingIntent pendingIntent, boolean z17) {
        this.f469464h = pendingIntent;
        h(128, z17);
        return this;
    }

    public z2.k0 j(android.graphics.Bitmap bitmap) {
        androidx.core.graphics.drawable.IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (android.os.Build.VERSION.SDK_INT < 27) {
                android.content.res.Resources resources = this.f469457a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480253sm);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480252sl);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = java.lang.Math.min(dimensionPixelSize / java.lang.Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / java.lang.Math.max(1, bitmap.getHeight()));
                    bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(bitmap.getWidth() * min), (int) java.lang.Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            android.graphics.PorterDuff.Mode mode = androidx.core.graphics.drawable.IconCompat.f11036k;
            bitmap.getClass();
            androidx.core.graphics.drawable.IconCompat iconCompat2 = new androidx.core.graphics.drawable.IconCompat(1);
            iconCompat2.f11038b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f469465i = iconCompat;
        return this;
    }

    public z2.k0 k(android.net.Uri uri) {
        android.app.Notification notification = this.D;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = z2.j0.a(z2.j0.e(z2.j0.c(z2.j0.b(), 4), 5));
        return this;
    }

    public z2.k0 l(z2.s0 s0Var) {
        if (this.f469468l != s0Var) {
            this.f469468l = s0Var;
            if (s0Var != null && s0Var.f469520a != this) {
                s0Var.f469520a = this;
                l(s0Var);
            }
        }
        return this;
    }

    public z2.k0 m(java.lang.CharSequence charSequence) {
        this.D.tickerText = c(charSequence);
        return this;
    }
}
