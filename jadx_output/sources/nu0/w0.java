package nu0;

/* loaded from: classes5.dex */
public final class w0 extends hw0.z {

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f340126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f340126w = jz5.h.b(new nu0.v0(this));
    }

    @Override // hw0.z
    public du0.o A7() {
        return (du0.o) T6(nu0.b1.class);
    }

    @Override // hw0.z
    public gx0.hf B7() {
        return (gx0.hf) T6(nu0.i4.class);
    }

    @Override // hw0.z
    public java.lang.Object D7(java.lang.String text, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        bu0.a aVar = (bu0.a) ((java.util.LinkedHashMap) H7().f340074q).get(mjid.value());
        mu0.a aVar2 = aVar instanceof mu0.a ? (mu0.a) aVar : null;
        if (aVar2 != null) {
            kotlin.jvm.internal.o.g(text, "text");
            aVar2.f331333a.g(text);
        }
        nu0.q0.Y6(H7(), false, null, 3, null);
        return jz5.f0.f302826a;
    }

    public final nu0.q0 H7() {
        return (nu0.q0) ((jz5.n) this.f340126w).getValue();
    }

    @Override // hw0.z
    public void s7() {
        nu0.q0.Y6(H7(), false, null, 3, null);
    }

    @Override // hw0.z
    public void t7() {
        com.tencent.maas.imagestudio.MJImageLayer mJImageLayer;
        bu0.a u76 = u7();
        mu0.a aVar = u76 instanceof mu0.a ? (mu0.a) u76 : null;
        if (aVar == null || (mJImageLayer = aVar.f331333a) == null) {
            return;
        }
        java.lang.String title = mJImageLayer.getTitle();
        boolean z17 = true;
        if (title == null || title.length() == 0) {
            java.lang.String subtitle = mJImageLayer.getSubtitle();
            if (subtitle != null && subtitle.length() != 0) {
                z17 = false;
            }
            if (z17) {
                nu0.q0 H7 = H7();
                java.lang.String layerID = mJImageLayer.getLayerID();
                if (layerID == null) {
                    H7.getClass();
                    return;
                }
                H7.f7(layerID);
                nu0.q0.Y6(H7, false, null, 3, null);
                kotlin.jvm.internal.m0.c(H7.f340074q).remove(layerID);
            }
        }
    }

    @Override // hw0.z
    public bu0.a u7() {
        nu0.q0 H7 = H7();
        com.tencent.maas.base.MJID mjid = this.f285498u;
        return (bu0.a) ((java.util.LinkedHashMap) H7.f340074q).get(mjid != null ? mjid.value() : null);
    }

    @Override // hw0.z
    public void w7() {
        hw0.p pVar = (hw0.p) this.f69240i;
        com.tencent.maas.base.MJID mjid = pVar != null ? (com.tencent.maas.base.MJID) com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel.k(pVar, "key_mj_id", null, 2, null) : null;
        if (mjid == null) {
            return;
        }
        com.tencent.maas.imagestudio.MJImageLayer b76 = H7().b7(mjid.value());
        if (b76 == null) {
            super.w7();
            return;
        }
        this.f285498u = mjid;
        java.lang.String title = b76.getTitle();
        if (title == null) {
            title = "";
        }
        this.f285499v = title;
        q7(title);
        G7();
        hw0.p pVar2 = (hw0.p) this.f69240i;
        if (pVar2 != null) {
            pVar2.setInputMethodChangeCallback(new hw0.v(this, mjid));
        }
    }

    @Override // hw0.z
    public ow0.a0 y7() {
        return (ow0.a0) T6(nu0.s.class);
    }

    @Override // hw0.z
    public gx0.w z7() {
        return (gx0.w) T6(nu0.u0.class);
    }
}
