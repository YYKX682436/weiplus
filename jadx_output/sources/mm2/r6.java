package mm2;

/* loaded from: classes3.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w6 f329381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o6 f329382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(mm2.w6 w6Var, mm2.o6 o6Var) {
        super(0);
        this.f329381d = w6Var;
        this.f329382e = o6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.o6 o6Var;
        java.lang.Object obj;
        mm2.w6 w6Var = this.f329381d;
        java.util.Iterator it = w6Var.f329518f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            o6Var = this.f329382e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((mm2.o6) obj).f329337a.f329357d, o6Var.f329337a.f329357d)) {
                break;
            }
        }
        if (obj == null) {
            java.util.LinkedList linkedList = w6Var.f329518f;
            linkedList.add(o6Var);
            if (linkedList.size() > 1) {
                kz5.g0.t(linkedList, new mm2.q6());
            }
            com.tencent.mars.xlog.Log.i("LiveToastManagerSlice", "offer state: " + o6Var + " toastList: " + linkedList);
        }
        return jz5.f0.f302826a;
    }
}
