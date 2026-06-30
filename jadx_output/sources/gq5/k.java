package gq5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq5.o f274641d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gq5.o oVar) {
        super(1);
        this.f274641d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h state = (eq5.h) obj;
        kotlin.jvm.internal.o.g(state, "state");
        eq5.g gVar = (eq5.g) state.a(eq5.g.class);
        gq5.o oVar = this.f274641d;
        if (gVar != null) {
            oVar.f274656n = gVar.f255913c;
            java.util.List list = gVar.f255912b;
            oVar.f274659q = list;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f17 = i65.a.f(oVar.getContext(), com.tencent.mm.R.dimen.f479678ce);
            int f18 = i65.a.f(oVar.getContext(), com.tencent.mm.R.dimen.amw);
            java.util.Iterator it = list.iterator();
            while (true) {
                android.graphics.Bitmap bitmap = null;
                if (!it.hasNext()) {
                    break;
                }
                eq5.a aVar = (eq5.a) it.next();
                r45.y77 y77Var = new r45.y77();
                y77Var.f390844e = aVar.f255908c;
                r45.z77 z77Var = aVar.f255907b;
                y77Var.f390843d = z77Var.f391784d;
                r45.a87 a87Var = new r45.a87();
                a87Var.f369832d = aVar.f255909d;
                a87Var.f369833e = aVar.f255910e;
                y77Var.f390845f = a87Var;
                arrayList.add(y77Var);
                if (arrayList2.isEmpty()) {
                    r45.z77 z77Var2 = r45.z77.Image;
                    java.lang.String str = aVar.f255906a;
                    if (z77Var == z77Var2) {
                        bitmap = com.tencent.mm.sdk.platformtools.x.T(str, f17, f18, true);
                    } else if (z77Var == r45.z77.Video) {
                        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                        bitmap = ai3.d.p(str);
                    }
                    if (bitmap != null) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        arrayList2.add(new com.tencent.mm.protobuf.g(byteArray));
                    }
                }
            }
            j75.f Q6 = oVar.Q6();
            java.lang.String str2 = oVar.f274655m;
            if (Q6 != null && (hVar = (eq5.h) Q6.getState()) != null) {
                hVar.f255920n = oVar.f274656n;
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    int ordinal = ((eq5.a) it6.next()).f255907b.ordinal();
                    if (ordinal == 0) {
                        hVar.f255917h++;
                    } else if (ordinal == 1) {
                        hVar.f255918i++;
                    } else if (ordinal == 2) {
                        hVar.f255919m++;
                    }
                }
                com.tencent.mars.xlog.Log.i(str2, "imgCount:" + hVar.f255917h + ", videoCount:" + hVar.f255918i + ", fileCount:" + hVar.f255919m);
            }
            com.tencent.mars.xlog.Log.i(str2, "prepareSendFile, contentInfo size:" + arrayList.size() + ", thumbnails size:" + arrayList2.size());
            aq5.x0 x0Var = new aq5.x0(arrayList, arrayList2);
            j75.f Q62 = oVar.Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.j(x0Var));
            }
            j75.f Q63 = oVar.Q6();
            if (Q63 != null) {
                Q63.B3(new eq5.i(15));
            }
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) oVar.f274622g).getValue(), null, new gq5.m(x0Var, oVar, null), 1, null);
        }
        if (((eq5.d) state.a(eq5.d.class)) != null) {
            j75.f Q64 = oVar.Q6();
            if (Q64 != null) {
                Q64.B3(new eq5.i(1));
            }
            oVar.U6();
        }
        if (((eq5.f) state.a(eq5.f.class)) != null) {
            j75.f Q65 = oVar.Q6();
            if (Q65 != null) {
                Q65.B3(new eq5.i(1));
            }
            oVar.U6();
        }
        return jz5.f0.f302826a;
    }
}
