package hk5;

/* loaded from: classes5.dex */
public final class k extends o50.j {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f282009i;

    /* renamed from: m, reason: collision with root package name */
    public hk5.c f282010m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f282011n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new nb5.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.getType() == 1) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o50.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View U6(co.a r3) {
        /*
            r2 = this;
            nb5.b r3 = (nb5.b) r3
            java.lang.String r0 = "model"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.Class<zn5.k> r0 = zn5.k.class
            i95.m r0 = i95.n0.c(r0)
            zn5.k r0 = (zn5.k) r0
            zn5.l r0 = (zn5.l) r0
            r0.Zi()
            v05.b r0 = r3.j()
            if (r0 == 0) goto L2e
            int r1 = r0.f432315e
            int r1 = r1 + 39
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            s05.d r0 = (s05.d) r0
            if (r0 == 0) goto L2e
            int r0 = r0.getType()
            r1 = 1
            if (r0 != r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L3e
            io.d r0 = new io.d
            r0.<init>()
            nb5.b r1 = r0.f293174c
            r0.f293174c = r3
            r0.c(r1, r3)
            goto L4a
        L3e:
            io.f r0 = new io.f
            r0.<init>()
            nb5.b r1 = r0.f293180c
            r0.f293180c = r3
            r0.c(r1, r3)
        L4a:
            androidx.appcompat.app.AppCompatActivity r3 = r2.getActivity()
            android.view.View r3 = r0.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hk5.k.U6(co.a):android.view.View");
    }

    @Override // o50.j, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hk5.e(this));
        }
    }
}
