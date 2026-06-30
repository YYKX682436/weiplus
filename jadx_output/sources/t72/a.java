package t72;

/* loaded from: classes3.dex */
public final class a extends dm.q3 {
    static {
        dm.q3.initAutoDBInfo(t72.a.class);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(t72.a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        java.lang.String str = this.field_name;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.tag.FavTagInfo");
        str.equals(((t72.a) obj).field_name);
        return true;
    }

    public int hashCode() {
        return t72.a.class.hashCode();
    }
}
