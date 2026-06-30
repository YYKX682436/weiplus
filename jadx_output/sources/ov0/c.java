package ov0;

/* loaded from: classes5.dex */
public abstract class c extends ov0.i0 implements vw0.d0 {

    /* renamed from: p, reason: collision with root package name */
    public sw0.b f349117p;

    /* renamed from: q, reason: collision with root package name */
    public sw0.b f349118q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f349119r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f349120s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f349120s = jz5.h.b(new ov0.b(this));
    }

    @Override // ov0.i0
    public sw0.c l7(ov0.e page) {
        kotlin.jvm.internal.o.g(page, "page");
        int ordinal = page.ordinal();
        if (ordinal == 0) {
            return new sw0.c(getString(com.tencent.mm.R.string.lkj), ov0.e.f349125e, new vw0.j(getActivity()));
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        java.lang.String string = getString(com.tencent.mm.R.string.lkk);
        ov0.e eVar = ov0.e.f349126f;
        vw0.i0 i0Var = new vw0.i0(getActivity());
        i0Var.f440793p.setVisibility(s7() ? 0 : 8);
        return new sw0.c(string, eVar, i0Var);
    }

    @Override // vw0.d0
    public void s(sw0.d data) {
        java.lang.String f17;
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f349119r) {
            sw0.b bVar = this.f349118q;
            f17 = bVar != null ? bVar.f413416c : null;
        } else {
            sw0.b bVar2 = this.f349117p;
            if (bVar2 == null || (f17 = bVar2.f413416c) == null) {
                f17 = u7().f(t7());
            }
        }
        u7().w(data, f17);
    }

    public boolean s7() {
        return false;
    }

    public abstract ug.m t7();

    public final xw0.r u7() {
        return (xw0.r) ((jz5.n) this.f349120s).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v7() {
        /*
            r3 = this;
            sw0.b r0 = r3.f349118q
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.String r0 = r0.f413414a
            goto L9
        L8:
            r0 = r1
        L9:
            sw0.b r2 = r3.f349117p
            if (r2 == 0) goto Lf
            java.lang.String r1 = r2.f413414a
        Lf:
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            r1 = 0
            if (r0 != 0) goto L30
            sw0.b r0 = r3.f349118q
            r2 = 1
            if (r0 == 0) goto L2c
            java.lang.String r0 = r0.f413414a
            if (r0 == 0) goto L2c
            int r0 = r0.length()
            if (r0 <= 0) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r1
        L28:
            if (r0 != r2) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto L30
            r1 = r2
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ov0.c.v7():boolean");
    }

    @Override // ov0.i0
    /* renamed from: w7, reason: merged with bridge method [inline-methods] */
    public void Z6(ov0.a panel) {
        kotlin.jvm.internal.o.g(panel, "panel");
        super.Z6(panel);
        panel.setSelectedCallback$plugin_mj_template_release(this);
    }
}
