package sg2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f407889a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f407890b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f407891c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f407892d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f407893e;

    public d(java.lang.String f_gifting_pag, java.lang.String f_primary_pag, java.lang.String f_sound_mp3, java.lang.String d_primary_lua, java.lang.String d_gifting_lua) {
        kotlin.jvm.internal.o.g(f_gifting_pag, "f_gifting_pag");
        kotlin.jvm.internal.o.g(f_primary_pag, "f_primary_pag");
        kotlin.jvm.internal.o.g(f_sound_mp3, "f_sound_mp3");
        kotlin.jvm.internal.o.g(d_primary_lua, "d_primary_lua");
        kotlin.jvm.internal.o.g(d_gifting_lua, "d_gifting_lua");
        this.f407889a = f_gifting_pag;
        this.f407890b = f_primary_pag;
        this.f407891c = f_sound_mp3;
        this.f407892d = d_primary_lua;
        this.f407893e = d_gifting_lua;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg2.d)) {
            return false;
        }
        sg2.d dVar = (sg2.d) obj;
        return kotlin.jvm.internal.o.b(this.f407889a, dVar.f407889a) && kotlin.jvm.internal.o.b(this.f407890b, dVar.f407890b) && kotlin.jvm.internal.o.b(this.f407891c, dVar.f407891c) && kotlin.jvm.internal.o.b(this.f407892d, dVar.f407892d) && kotlin.jvm.internal.o.b(this.f407893e, dVar.f407893e);
    }

    public int hashCode() {
        return (((((((this.f407889a.hashCode() * 31) + this.f407890b.hashCode()) * 31) + this.f407891c.hashCode()) * 31) + this.f407892d.hashCode()) * 31) + this.f407893e.hashCode();
    }

    public java.lang.String toString() {
        return "ResourceStatus(f_gifting_pag=" + this.f407889a + ", f_primary_pag=" + this.f407890b + ", f_sound_mp3=" + this.f407891c + ", d_primary_lua=" + this.f407892d + ", d_gifting_lua=" + this.f407893e + ')';
    }
}
