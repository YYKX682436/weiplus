package l3;

/* loaded from: classes15.dex */
public abstract class i implements l3.f {

    /* renamed from: a, reason: collision with root package name */
    public final l3.h f315300a;

    public i(l3.h hVar) {
        this.f315300a = hVar;
    }

    public abstract boolean a();

    public boolean b(java.lang.CharSequence charSequence, int i17, int i18) {
        if (charSequence == null || i17 < 0 || i18 < 0 || charSequence.length() - i18 < i17) {
            throw new java.lang.IllegalArgumentException();
        }
        l3.h hVar = this.f315300a;
        if (hVar == null) {
            return a();
        }
        int a17 = hVar.a(charSequence, i17, i18);
        if (a17 == 0) {
            return true;
        }
        if (a17 != 1) {
            return a();
        }
        return false;
    }
}
