package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f120552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e9 f120553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.finder.live.widget.e9 e9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120552e = z2Var;
        this.f120553f = e9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.z8(this.f120552e, this.f120553f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.z8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.td2 td2Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120551d;
        com.tencent.mm.plugin.finder.live.widget.e9 e9Var = this.f120553f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.widget.y8 y8Var = new com.tencent.mm.plugin.finder.live.widget.y8(e9Var, null);
            this.f120551d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, y8Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        this.f120552e.B();
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        boolean z17 = false;
        java.lang.Object obj2 = lVar.f302834e;
        if (booleanValue) {
            db5.t7.h(e9Var.f118237a, (java.lang.String) obj2);
            mm2.g0 g0Var = (mm2.g0) e9Var.f118238b.a(mm2.g0.class);
            r45.hf5 previewInfo = e9Var.a();
            kotlin.jvm.internal.o.g(previewInfo, "previewInfo");
            if (previewInfo.getInteger(0) == 1) {
                r45.td2 td2Var2 = g0Var.f329066m;
                if (td2Var2 != null) {
                    td2Var2.set(1, java.lang.Integer.valueOf(previewInfo.getInteger(1)));
                }
            } else if (previewInfo.getInteger(0) == 2) {
                int integer = previewInfo.getInteger(2);
                int N6 = g0Var.N6(2);
                if (1 <= N6 && N6 < integer) {
                    z17 = true;
                }
                if (z17 && (td2Var = g0Var.f329066m) != null) {
                    td2Var.set(3, java.lang.Integer.valueOf(td2Var.getInteger(3) + (integer - N6)));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTrialInfoForModify to:");
            r45.td2 td2Var3 = g0Var.f329066m;
            if (td2Var3 == null) {
                str = "FinderLiveUrlOption:NULL!";
            } else {
                str = "FinderLiveUrlOption:[" + td2Var3.getInteger(1) + ',' + td2Var3.getInteger(3) + ']';
            }
            sb6.append(str);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("LiveChargeSlice", sb6.toString());
        } else {
            android.content.Context context = e9Var.f118237a;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0);
            z2Var.y(context.getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var.F = new com.tencent.mm.plugin.finder.live.widget.w8(z2Var);
            z2Var.x(1);
            z2Var.i(com.tencent.mm.R.layout.f488884aq4);
            ((android.widget.TextView) z2Var.f212058g.findViewById(com.tencent.mm.R.id.o3b)).setText((java.lang.String) obj2);
            z2Var.C();
        }
        return jz5.f0.f302826a;
    }
}
