package kk;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f308474a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.s[] f308475b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f308476c;

    /* renamed from: d, reason: collision with root package name */
    public int f308477d = 0;

    public t(int i17) {
        this.f308474a = i17;
        this.f308475b = new kk.s[i17];
        this.f308476c = new java.util.HashMap(i17);
    }

    public synchronized java.lang.Object a(java.lang.Object obj) {
        kk.s sVar = (kk.s) this.f308476c.get(obj);
        if (sVar == null) {
            return null;
        }
        sVar.f308472f = java.lang.System.currentTimeMillis();
        c(sVar.f308473g);
        return sVar.f308471e;
    }

    public synchronized java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        kk.s sVar = (kk.s) this.f308476c.get(obj);
        if (sVar != null) {
            java.lang.Object obj3 = sVar.f308471e;
            sVar.f308471e = obj2;
            sVar.f308472f = java.lang.System.currentTimeMillis();
            c(sVar.f308473g);
            return obj3;
        }
        int i17 = this.f308477d;
        if (i17 >= this.f308474a) {
            this.f308476c.remove(this.f308475b[0].f308470d);
            kk.s sVar2 = new kk.s(obj, obj2, 0);
            this.f308475b[0] = sVar2;
            c(sVar2.f308473g);
            this.f308476c.put(obj, sVar2);
        } else {
            kk.s sVar3 = new kk.s(obj, obj2, i17);
            kk.s[] sVarArr = this.f308475b;
            int i18 = this.f308477d;
            this.f308477d = i18 + 1;
            sVarArr[i18] = sVar3;
            this.f308476c.put(obj, sVar3);
        }
        return null;
    }

    public final void c(int i17) {
        int i18 = i17 << 1;
        int i19 = i18 + 1;
        int i27 = i18 + 2;
        int i28 = this.f308477d;
        if (i19 >= i28) {
            return;
        }
        kk.s[] sVarArr = this.f308475b;
        if (i27 >= i28) {
            if (sVarArr[i17].f308472f >= sVarArr[i19].f308472f) {
                d(i17, i19);
                c(i19);
                return;
            }
            return;
        }
        long j17 = sVarArr[i19].f308472f;
        long j18 = sVarArr[i27].f308472f;
        long j19 = j17 - j18;
        if (j19 <= 0 && j17 <= sVarArr[i17].f308472f) {
            d(i17, i19);
            c(i19);
        } else {
            if (j19 <= 0 || j18 > sVarArr[i17].f308472f) {
                return;
            }
            d(i17, i27);
            c(i27);
        }
    }

    public final void d(int i17, int i18) {
        kk.s[] sVarArr = this.f308475b;
        kk.s sVar = sVarArr[i17];
        kk.s sVar2 = sVarArr[i18];
        sVarArr[i17] = sVar2;
        sVar2.f308473g = i17;
        sVarArr[i18] = sVar;
        sVar.f308473g = i18;
    }
}
