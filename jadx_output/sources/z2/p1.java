package z2;

/* loaded from: classes13.dex */
public abstract class p1 {
    public static z2.r1 a(android.app.Person person) {
        androidx.core.graphics.drawable.IconCompat iconCompat;
        z2.q1 q1Var = new z2.q1();
        q1Var.f469507a = person.getName();
        androidx.core.graphics.drawable.IconCompat iconCompat2 = null;
        if (person.getIcon() != null) {
            android.graphics.drawable.Icon icon = person.getIcon();
            android.graphics.PorterDuff.Mode mode = androidx.core.graphics.drawable.IconCompat.f11036k;
            icon.getClass();
            int c17 = f3.e.c(icon);
            if (c17 != 2) {
                if (c17 == 4) {
                    android.net.Uri d17 = f3.e.d(icon);
                    d17.getClass();
                    java.lang.String uri = d17.toString();
                    uri.getClass();
                    iconCompat = new androidx.core.graphics.drawable.IconCompat(4);
                    iconCompat.f11038b = uri;
                } else if (c17 != 6) {
                    iconCompat2 = new androidx.core.graphics.drawable.IconCompat(-1);
                    iconCompat2.f11038b = icon;
                } else {
                    android.net.Uri d18 = f3.e.d(icon);
                    d18.getClass();
                    java.lang.String uri2 = d18.toString();
                    uri2.getClass();
                    iconCompat = new androidx.core.graphics.drawable.IconCompat(6);
                    iconCompat.f11038b = uri2;
                }
                iconCompat2 = iconCompat;
            } else {
                iconCompat2 = androidx.core.graphics.drawable.IconCompat.e(null, f3.e.b(icon), f3.e.a(icon));
            }
        }
        q1Var.f469508b = iconCompat2;
        q1Var.f469509c = person.getUri();
        q1Var.f469510d = person.getKey();
        q1Var.f469511e = person.isBot();
        q1Var.f469512f = person.isImportant();
        return new z2.r1(q1Var);
    }

    public static android.app.Person b(z2.r1 r1Var) {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(r1Var.f469513a);
        android.graphics.drawable.Icon icon = null;
        androidx.core.graphics.drawable.IconCompat iconCompat = r1Var.f469514b;
        if (iconCompat != null) {
            iconCompat.getClass();
            icon = f3.e.f(iconCompat, null);
        }
        return name.setIcon(icon).setUri(r1Var.f469515c).setKey(r1Var.f469516d).setBot(r1Var.f469517e).setImportant(r1Var.f469518f).build();
    }
}
