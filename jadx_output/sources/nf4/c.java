package nf4;

/* loaded from: classes4.dex */
public final class c extends dm.cb {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f336842x = dm.cb.initAutoDBInfo(nf4.c.class);

    @Override // dm.cb, l75.f0
    public void convertFrom(android.database.Cursor cu6) {
        kotlin.jvm.internal.o.g(cu6, "cu");
        super.convertFrom(cu6);
    }

    @Override // dm.cb, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f336842x;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public java.lang.String toString() {
        return this.field_timeStamp + ", " + this.systemRowid + ", " + this.field_mixFlag;
    }
}
