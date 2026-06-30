package h6;

/* loaded from: classes14.dex */
public abstract class h {
    public static final x5.g a(c6.j jVar, java.lang.Object data) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        jz5.l lVar = jVar.f38836h;
        if (lVar == null) {
            return null;
        }
        x5.g gVar = (x5.g) lVar.f302833d;
        if (((java.lang.Class) lVar.f302834e).isAssignableFrom(data.getClass())) {
            return gVar;
        }
        throw new java.lang.IllegalStateException((((java.lang.Object) gVar.getClass().getName()) + " cannot handle data with type " + ((java.lang.Object) data.getClass().getName()) + '.').toString());
    }

    public static final boolean b(c6.j jVar) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        int ordinal = jVar.f38846r.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        e6.b bVar = jVar.f38831c;
        boolean z17 = bVar instanceof e6.c;
        d6.h hVar = jVar.f38842n;
        if (z17 && (((coil.target.ImageViewTarget) ((e6.c) bVar)).f43914d instanceof android.widget.ImageView) && (hVar instanceof d6.l) && ((d6.f) ((d6.l) hVar)).f226639c == ((coil.target.ImageViewTarget) ((e6.c) bVar)).f43914d) {
            return true;
        }
        return jVar.G.f38786b == null && (hVar instanceof d6.a);
    }

    public static final android.graphics.drawable.Drawable c(c6.j jVar, android.graphics.drawable.Drawable drawable, java.lang.Integer num, android.graphics.drawable.Drawable drawable2) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return h6.c.a(jVar.f38829a, num.intValue());
    }
}
