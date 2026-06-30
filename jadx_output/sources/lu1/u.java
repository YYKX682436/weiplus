package lu1;

/* loaded from: classes15.dex */
public abstract class u {
    public static int a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || !lu1.a0.y(str)) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.t8.P(str, 0);
    }

    public static ot0.q b(tt1.j jVar, java.lang.String str, int i17) {
        int i18;
        if (jVar == null) {
            return null;
        }
        if (i17 == 23) {
            i17 = 2;
            i18 = 1;
        } else {
            i18 = 0;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ot0.q qVar = new ot0.q();
        if (jVar.s0() != null) {
            qVar.f348654f = jVar.Y().f377580d;
            qVar.f348658g = jVar.s0().f388553n;
            qVar.f348666i = 16;
            qVar.f348634J = 0;
            qVar.f348706s = 3;
            qVar.f348646d = jVar.s0().f388547f;
            qVar.f348635a0 = 0;
            qVar.f348734z = jVar.s0().f388546e;
            qVar.W0 = i17;
            qVar.V0 = jVar.s0().f388552m;
            qVar.f348674k = jVar.s0().A;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<from_username>");
        sb7.append(jVar.a());
        sb7.append("</from_username>");
        if (lu1.a0.u(i17)) {
            sb7.append("<card_id>");
            sb7.append(jVar.f());
            sb7.append("</card_id>");
        } else if (i17 == 5) {
            sb7.append("<card_id>");
            sb7.append(jVar.g());
            sb7.append("</card_id>");
        }
        sb7.append("<card_type>");
        sb7.append(jVar.s0().f388550i);
        sb7.append("</card_type><from_scene>");
        sb7.append(i17);
        sb7.append("</from_scene><color>");
        sb7.append(jVar.s0().f388555p);
        sb7.append("</color><card_type_name>");
        sb7.append(jVar.s0().f388568y);
        sb7.append("</card_type_name><brand_name>");
        sb7.append(jVar.s0().f388552m);
        sb7.append("</brand_name>");
        if (android.text.TextUtils.isEmpty(str)) {
            sb7.append("<card_ext></card_ext>");
        } else {
            sb7.append("<card_ext>");
            sb7.append(str);
            sb7.append("</card_ext>");
        }
        sb7.append("<is_recommend>");
        sb7.append(i18);
        sb7.append("</is_recommend><recommend_card_id>");
        sb7.append(jVar.g());
        sb7.append("</recommend_card_id>");
        sb6.append(sb7.toString());
        qVar.U0 = sb6.toString();
        qVar.T0 = ot0.q.u(qVar, null, null);
        return qVar;
    }

    public static java.lang.String c(xt1.f fVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<from_username>");
        sb6.append(fVar.f456465a);
        sb6.append("</from_username><card_id>");
        sb6.append(fVar.f456466b);
        sb6.append("</card_id><card_type>");
        sb6.append(fVar.f456467c);
        sb6.append("</card_type><from_scene>");
        sb6.append(fVar.f456468d);
        sb6.append("</from_scene><color>");
        sb6.append(fVar.f456469e);
        sb6.append("</color><card_type_name>");
        sb6.append(fVar.f456470f);
        sb6.append("</card_type_name><brand_name>");
        sb6.append(fVar.f456471g);
        sb6.append("</brand_name>");
        if (android.text.TextUtils.isEmpty(fVar.f456472h)) {
            sb6.append("<card_ext></card_ext>");
        } else {
            sb6.append("<card_ext>");
            sb6.append(fVar.f456472h);
            sb6.append("</card_ext>");
        }
        sb6.append("<is_recommend>");
        sb6.append(fVar.f456473i);
        sb6.append("</is_recommend><recommend_card_id>");
        sb6.append(fVar.f456474j);
        sb6.append("</recommend_card_id>");
        return sb6.toString();
    }

    public static xt1.f d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        xt1.f fVar = new xt1.f();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 == null) {
            return fVar;
        }
        fVar.f456465a = (java.lang.String) d17.get(".msg.appmsg.carditem.from_username");
        fVar.f456466b = (java.lang.String) d17.get(".msg.appmsg.carditem.card_id");
        fVar.f456467c = a((java.lang.String) d17.get(".msg.appmsg.carditem.card_type"));
        fVar.f456468d = a((java.lang.String) d17.get(".msg.appmsg.carditem.from_scene"));
        fVar.f456469e = (java.lang.String) d17.get(".msg.appmsg.carditem.color");
        fVar.f456470f = (java.lang.String) d17.get(".msg.appmsg.carditem.card_type_name");
        fVar.f456471g = (java.lang.String) d17.get(".msg.appmsg.carditem.brand_name");
        fVar.f456472h = (java.lang.String) d17.get(".msg.appmsg.carditem.card_ext");
        fVar.f456473i = a((java.lang.String) d17.get(".msg.appmsg.carditem.is_recommend"));
        fVar.f456474j = (java.lang.String) d17.get(".msg.appmsg.carditem.recommend_card_id");
        return fVar;
    }
}
