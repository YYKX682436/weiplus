package hf2;

/* loaded from: classes10.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f281065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f281066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(hf2.p1 p1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281065e = p1Var;
        this.f281066f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hf2.g1(this.f281065e, this.f281066f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        java.lang.Object j17;
        int i17;
        r45.ei0 ei0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f281064d;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        hf2.p1 p1Var = this.f281065e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.ee6 b76 = p1Var.f281136a.b7(this.f281066f, 0, "");
            this.f281064d = 1;
            p1Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            boolean z17 = b76.f373372h.f373530e.size() > 0;
            boolean z18 = b76.f373372h.f373529d.size() > 0;
            hf2.x xVar = p1Var.f281136a;
            android.graphics.Bitmap bitmap = ((je2.g) xVar.business(je2.g.class)).f299223h;
            java.lang.String str = p1Var.f281137b;
            if (z18 && bitmap != null) {
                java.util.LinkedList textItemRestoreDataList = b76.f373372h.f373529d;
                kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
                if (ji0Var != null) {
                    if (ji0Var.f377832q == null) {
                        ji0Var.f377832q = new r45.he6();
                    }
                    r45.he6 he6Var = ji0Var.f377832q;
                    he6Var.f376098d = true;
                    he6Var.f376100f = bitmap.getHeight();
                    he6Var.f376099e = bitmap.getWidth();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dropBitmap set genExtraConfig:");
                    r45.he6 genExtraConfig = ji0Var.f377832q;
                    kotlin.jvm.internal.o.f(genExtraConfig, "genExtraConfig");
                    sb6.append(pm0.b0.g(genExtraConfig));
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dropBitmap,needPic:");
            sb7.append(z17);
            sb7.append(",needText:");
            sb7.append(z18);
            sb7.append(",lastTextBitmap:");
            sb7.append(bitmap);
            sb7.append('(');
            sb7.append(bitmap != null ? new java.lang.Integer(bitmap.getWidth()) : null);
            sb7.append('*');
            sb7.append(bitmap != null ? new java.lang.Integer(bitmap.getHeight()) : null);
            sb7.append("), ");
            sb7.append(je2.g.f299220u.a(b76));
            sb7.append('!');
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            f0Var = f0Var3;
            qc0.g1 wi6 = ((pc0.i2) ((qc0.h1) i95.n0.c(qc0.h1.class))).wi(xVar.O6(), b76, new qc0.p1(new hf2.i1(p1Var, nVar), new hf2.j1(p1Var, nVar), new hf2.k1(p1Var, nVar), new hf2.l1(p1Var)));
            if (wi6 != null) {
                p1Var.f281139d = wi6;
                if (z18) {
                    if (bitmap != null) {
                        r45.ei0 editorItemRestoreData = b76.f373372h;
                        kotlin.jvm.internal.o.f(editorItemRestoreData, "editorItemRestoreData");
                        i17 = 1;
                        ei0Var = ((com.tencent.mm.plugin.recordvideo.ui.editor.sticker.StickerEditorContainer) wi6).h(1, editorItemRestoreData, bitmap);
                    } else {
                        i17 = 1;
                        ei0Var = null;
                    }
                    xVar.t7("dropBitmap", ei0Var);
                } else {
                    i17 = 1;
                }
                if (!z17) {
                    qc0.g1.a(wi6, null, i17, null);
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e(str, "dropBitmap fail,sticker editor container is null!");
                nVar.a(java.lang.Boolean.FALSE);
            }
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
            f0Var = f0Var3;
        }
        boolean booleanValue = ((java.lang.Boolean) j17).booleanValue();
        com.tencent.mars.xlog.Log.i(p1Var.f281137b, "dropBitmap suc:" + booleanValue);
        return f0Var;
    }
}
