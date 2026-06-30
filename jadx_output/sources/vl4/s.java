package vl4;

/* loaded from: classes11.dex */
public final class s extends com.tencent.unit_rc.BaseObject implements jm4.f1 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f437900f;

    /* renamed from: d, reason: collision with root package name */
    public ul4.i f437901d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f437902e;

    static {
        new vl4.r(null);
        f437900f = jz5.h.b(vl4.q.f437899d);
    }

    public void a() {
        ul4.i iVar = this.f437901d;
        if (iVar != null) {
            if (this.f437902e && iVar != null) {
                iVar.f428619g = new f25.c0(iVar.f428618f);
            }
            ul4.i iVar2 = this.f437901d;
            if (iVar2 != null) {
                jm4.h0 h0Var = jm4.h0.f300388e;
                byte[] byteArray = new bw5.vo0().toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                iVar2.e(h0Var, byteArray);
            }
            ul4.i iVar3 = this.f437901d;
            if (iVar3 == null) {
                return;
            }
            iVar3.f428622m = true;
        }
    }
}
