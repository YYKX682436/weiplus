package dz4;

/* loaded from: classes12.dex */
public final class f2 extends dz4.d2 {
    @Override // dz4.d2, dz4.z1
    public void a(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        o72.k4 oj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        dz4.i iVar = context.f245256c;
        o72.r2 F = oj6.F(iVar.f245293d);
        r45.bq0 bq0Var = F != null ? F.field_favProto : null;
        android.app.Activity activity = context.f245254a;
        if (bq0Var != null) {
            java.util.Iterator it = F.field_favProto.f370964f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 3 && (gp0Var.f375435s2 != 0 || gp0Var.V1 != 0)) {
                    h(activity, com.tencent.mm.R.string.f491209om);
                    return;
                }
            }
        }
        long j17 = iVar.f245293d;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 32;
        z9Var.f8532e = j17;
        favoriteOperationEvent.e();
        am.aa result = favoriteOperationEvent.f54244h;
        kotlin.jvm.internal.o.f(result, "result");
        if (result.f6136c == null) {
            h(activity, com.tencent.mm.R.string.cck);
            return;
        }
        if (result.f6142i) {
            h(activity, com.tencent.mm.R.string.f489709i);
            return;
        }
        if (result.f6134a != 0) {
            h(activity, com.tencent.mm.R.string.f489710j);
            return;
        }
        long h17 = ip.c.h();
        o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(iVar.f245293d);
        long j18 = F2 != null ? F2.field_datatotalsize : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteFlutterForwardChatHelper", "checkIfOverTotalSizeLimit totalSize:" + j18);
        if (j18 > h17) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.f491232cf0, com.tencent.mm.sdk.platformtools.t8.f0(h17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            db5.e1.T(activity, string);
        } else {
            co.a a17 = com.tencent.mm.plugin.fav.ui.i3.f101160a.a(F);
            dc5.a aVar = a17 instanceof dc5.a ? (dc5.a) a17 : null;
            if (aVar != null) {
                i(context.f245254a, aVar, context.f245257d, iVar.f245290a, context.f245255b);
                o72.v2.d(iVar.f245293d, 1, 0);
            }
        }
    }

    @Override // dz4.z1
    public void b(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.app.Activity activity = context.f245254a;
        android.app.Dialog e17 = e(activity);
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 13;
        z9Var.f8535h = activity;
        z9Var.f8538k = context.f245257d;
        z9Var.f8539l = context.f245258e;
        z9Var.f8532e = context.f245256c.f245293d;
        z9Var.f8537j = new dz4.e2(e17, this, context);
        favoriteOperationEvent.e();
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        kotlin.jvm.internal.o.g(context, "context");
        return context.f245256c.f245290a == 2;
    }
}
