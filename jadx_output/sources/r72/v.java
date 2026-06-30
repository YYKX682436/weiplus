package r72;

/* loaded from: classes16.dex */
public abstract class v {
    public static final r45.mv2 a(r72.u finderTopicItem) {
        kotlin.jvm.internal.o.g(finderTopicItem, "finderTopicItem");
        r45.mv2 mv2Var = new r45.mv2();
        mv2Var.set(0, finderTopicItem.q());
        mv2Var.set(1, java.lang.Integer.valueOf(finderTopicItem.r()));
        mv2Var.set(2, finderTopicItem.getIconUrl());
        mv2Var.set(3, finderTopicItem.j());
        mv2Var.set(7, finderTopicItem.l());
        mv2Var.set(5, finderTopicItem.o());
        r72.w n17 = finderTopicItem.n();
        if (n17 != null) {
            r45.hv2 hv2Var = new r45.hv2();
            hv2Var.set(0, n17.j());
            hv2Var.set(1, java.lang.Float.valueOf(n17.getLongitude()));
            hv2Var.set(2, java.lang.Float.valueOf(n17.getLatitude()));
            mv2Var.set(4, hv2Var);
        }
        r72.t k17 = finderTopicItem.k();
        if (k17 != null) {
            r45.ht0 ht0Var = new r45.ht0();
            ht0Var.set(0, k17.getTopicId());
            ht0Var.set(1, k17.getName());
            ht0Var.set(2, k17.j());
            ht0Var.set(4, java.lang.Long.valueOf(k17.k()));
            ht0Var.set(5, k17.getTitle());
            mv2Var.set(6, ht0Var);
        }
        r72.x p17 = finderTopicItem.p();
        if (p17 != null) {
            r45.ub4 ub4Var = new r45.ub4();
            ub4Var.set(0, p17.j());
            ub4Var.set(1, java.lang.Integer.valueOf(p17.k()));
            mv2Var.set(8, ub4Var);
        }
        return mv2Var;
    }

    public static final r72.u b(r45.mv2 originFinderTopic) {
        kotlin.jvm.internal.o.g(originFinderTopic, "originFinderTopic");
        r72.u uVar = new r72.u();
        uVar.A(originFinderTopic.getString(0));
        uVar.B(originFinderTopic.getInteger(1));
        uVar.w(originFinderTopic.getString(2));
        uVar.s(originFinderTopic.getString(3));
        uVar.u(originFinderTopic.getString(7));
        uVar.y(originFinderTopic.getString(5));
        r45.hv2 hv2Var = (r45.hv2) originFinderTopic.getCustom(4);
        if (hv2Var != null) {
            r72.w wVar = new r72.w();
            wVar.n(hv2Var.getString(0));
            wVar.l(hv2Var.getFloat(1));
            wVar.k(hv2Var.getFloat(2));
            uVar.x(wVar);
        }
        r45.ht0 ht0Var = (r45.ht0) originFinderTopic.getCustom(6);
        if (ht0Var != null) {
            r72.t tVar = new r72.t();
            tVar.q(ht0Var.getString(0));
            tVar.o(ht0Var.getString(1));
            tVar.l(ht0Var.getString(2));
            tVar.n(ht0Var.getLong(4));
            tVar.p(ht0Var.getString(5));
            uVar.t(tVar);
        }
        r45.ub4 ub4Var = (r45.ub4) originFinderTopic.getCustom(8);
        if (ub4Var != null) {
            r72.x xVar = new r72.x();
            xVar.l(ub4Var.getString(0));
            xVar.n(ub4Var.getInteger(1));
            uVar.z(xVar);
        }
        return uVar;
    }
}
