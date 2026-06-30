package fc;

/* loaded from: classes16.dex */
public abstract class s extends fc.b implements fc.u {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f260926n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public static final fc.r f260927o = new fc.r();

    /* renamed from: i, reason: collision with root package name */
    public transient java.lang.Object[] f260928i;

    /* renamed from: m, reason: collision with root package name */
    public final fc.u f260929m = this;

    public boolean contains(java.lang.Object obj) {
        return r(obj) >= 0;
    }

    public boolean containsKey(java.lang.Object obj) {
        return contains(obj);
    }

    @Override // fc.b
    public int d() {
        return this.f260928i.length;
    }

    @Override // fc.b
    public void l(int i17) {
        this.f260928i[i17] = f260926n;
        this.f260900d--;
        this.f260902f++;
        e();
    }

    @Override // fc.b
    public int m(int i17) {
        int a17 = fc.a.a(i17);
        g(a17);
        this.f260928i = new java.lang.Object[a17];
        return a17;
    }

    @Override // fc.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public fc.s clone() {
        fc.s sVar = (fc.s) super.clone();
        sVar.f260928i = (java.lang.Object[]) this.f260928i.clone();
        return sVar;
    }

    public final int o(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final boolean p(java.lang.Object obj, java.lang.Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    public int r(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object[] objArr = this.f260928i;
        int length = objArr.length;
        fc.u uVar = this.f260929m;
        int o17 = ((fc.s) uVar).o(obj) & Integer.MAX_VALUE;
        int i17 = o17 % length;
        java.lang.Object obj3 = objArr[i17];
        if (obj3 != null && (obj3 == (obj2 = f260926n) || !((fc.s) uVar).p(obj3, obj))) {
            int i18 = (o17 % (length - 2)) + 1;
            while (true) {
                i17 -= i18;
                if (i17 < 0) {
                    i17 += length;
                }
                obj3 = objArr[i17];
                if (obj3 == null || (obj3 != obj2 && ((fc.s) uVar).p(obj3, obj))) {
                    break;
                }
            }
        }
        if (obj3 == null) {
            return -1;
        }
        return i17;
    }

    public int s(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object[] objArr = this.f260928i;
        int length = objArr.length;
        fc.u uVar = this.f260929m;
        int o17 = ((fc.s) uVar).o(obj) & Integer.MAX_VALUE;
        int i17 = o17 % length;
        java.lang.Object obj3 = objArr[i17];
        if (obj3 == null) {
            return i17;
        }
        java.lang.Object obj4 = f260926n;
        if (obj3 == obj4 || !((fc.s) uVar).p(obj3, obj)) {
            int i18 = (o17 % (length - 2)) + 1;
            int i19 = obj3 == obj4 ? i17 : -1;
            do {
                i17 -= i18;
                if (i17 < 0) {
                    i17 += length;
                }
                obj2 = objArr[i17];
                if (i19 == -1 && obj2 == obj4) {
                    i19 = i17;
                }
                if (obj2 == null || obj2 == obj4) {
                    break;
                }
            } while (!((fc.s) uVar).p(obj2, obj));
            if (obj2 == obj4) {
                while (obj2 != null && (obj2 == obj4 || !((fc.s) uVar).p(obj2, obj))) {
                    i17 -= i18;
                    if (i17 < 0) {
                        i17 += length;
                    }
                    obj2 = objArr[i17];
                }
            }
            if (obj2 == null || obj2 == obj4) {
                return i19 == -1 ? i17 : i19;
            }
        }
        return (-i17) - 1;
    }

    public final void t(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Equal objects must have equal hashcodes. During rehashing, Trove discovered that the following two objects claim to be equal (as in java.lang.Object.equals() or TObjectHashingStrategy.equals()) but their hashCodes (or those calculated by your TObjectHashingStrategy) are not equal.This violates the general contract of java.lang.Object.hashCode().  See bullet point two in that method's documentation. object #1 =");
        sb6.append(obj);
        java.lang.String str2 = "";
        if (obj == null) {
            str = "";
        } else {
            str = " (" + obj.getClass() + ")";
        }
        sb6.append(str);
        sb6.append(", hashCode=");
        fc.u uVar = this.f260929m;
        sb6.append(((fc.s) uVar).o(obj));
        sb6.append("; object #2 =");
        sb6.append(obj2);
        if (obj2 != null) {
            str2 = " (" + obj2.getClass() + ")";
        }
        sb6.append(str2);
        sb6.append(", hashCode=");
        sb6.append(((fc.s) uVar).o(obj2));
        throw new java.lang.IllegalArgumentException(sb6.toString());
    }
}
