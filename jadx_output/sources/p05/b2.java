package p05;

/* loaded from: classes10.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f350459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f350460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p05.d2 d2Var, int i17, java.lang.String str) {
        super(0);
        this.f350459d = d2Var;
        this.f350460e = i17;
        this.f350461f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.Object obj;
        p05.x0 x0Var;
        v65.n nVar;
        p05.d2 d2Var = this.f350459d;
        try {
            java.util.Iterator it = d2Var.f350491f.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i17 = this.f350460e;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((p05.s1) obj).f350681a == ((long) i17)) {
                    break;
                }
            }
            p05.s1 s1Var = (p05.s1) obj;
            if (s1Var != null) {
                long j17 = s1Var.f350681a;
                int optInt = new org.json.JSONObject(this.f350461f).optInt("animEnd");
                java.util.ArrayList arrayList = d2Var.f350491f;
                if (optInt == 1 || optInt == 2) {
                    com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " end. remove now");
                    rh0.d0 d0Var = d2Var.f350488c;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).t(j17);
                    }
                    arrayList.remove(s1Var);
                } else if (optInt == 3) {
                    com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback ptr=" + i17 + " stage:" + s1Var.f350684d + "->222");
                    s1Var.f350684d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
                    java.util.Iterator it6 = arrayList.iterator();
                    kotlin.jvm.internal.o.f(it6, "iterator(...)");
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        kotlin.jvm.internal.o.f(next, "next(...)");
                        p05.s1 s1Var2 = (p05.s1) next;
                        if (kotlin.jvm.internal.o.b(s1Var2.f350682b, s1Var.f350682b)) {
                            break;
                        }
                        rh0.d0 d0Var2 = d2Var.f350488c;
                        if (d0Var2 != null) {
                            ((p05.l4) d0Var2).t(s1Var2.f350681a);
                        }
                        it6.remove();
                    }
                    if (s1Var.f350685e) {
                        rh0.d0 d0Var3 = d2Var.f350488c;
                        if (d0Var3 != null) {
                            ((p05.l4) d0Var3).t(j17);
                        }
                        arrayList.remove(s1Var);
                    }
                }
                com.tencent.mars.xlog.Log.i("FinderLivePkGiftEffect", "#weVisionJsonCallback done. workingEffectNativeIds.size=" + arrayList.size());
                if (arrayList.isEmpty() && (x0Var = d2Var.f350492g) != null && (nVar = ((tf2.g) x0Var).f418921b) != null) {
                    nVar.a(0);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderLivePkGiftEffect", e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
