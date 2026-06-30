package un1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.l f429446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f429447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f429448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f429449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(un1.l lVar, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f429446d = lVar;
        this.f429447e = j0Var;
        this.f429448f = n0Var;
        this.f429449g = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qo1.j0 j0Var = this.f429447e;
        long a17 = j0Var.a();
        un1.l lVar = this.f429446d;
        lVar.f429453p = a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRefreshWholeUi] pkgId=");
        sb6.append(j0Var.a());
        sb6.append(", state=");
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f429448f;
        sb6.append(n0Var);
        sb6.append(", error=");
        qo1.i0 i0Var = this.f429449g;
        sb6.append(i0Var);
        com.tencent.mars.xlog.Log.i(lVar.f429450m, sb6.toString());
        if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_INITED && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_QUIT && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_DELETING && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED) {
            lVar.f();
            lVar.k(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = lVar.f429452o;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("iconIv");
                throw null;
            }
            weImageView.s(com.tencent.mm.R.raw.icons_outlined_backup, com.tencent.mm.R.color.BW_50);
        }
        switch (n0Var) {
            case AFFROAM_TASK_STATE_INITED:
            case AFFROAM_TASK_STATE_PAUSED:
            case AFFROAM_TASK_STATE_QUIT:
            case AFFROAM_TASK_STATE_DELETING:
                lVar.d();
                break;
            case AFFROAM_TASK_STATE_PREPARING:
                android.widget.TextView textView = lVar.f429451n;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView.setText(com.tencent.mm.R.string.n0h);
                break;
            case AFFROAM_TASK_STATE_RUNNING:
                lVar.P5((qo1.f0) j0Var, -1.0f);
                break;
            case AFFROAM_TASK_STATE_COMPLETED:
                if (j0Var instanceof qo1.c1) {
                    android.widget.TextView textView2 = lVar.f429451n;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("titleTv");
                        throw null;
                    }
                    textView2.setText(com.tencent.mm.R.string.aas);
                    break;
                } else {
                    android.widget.TextView textView3 = lVar.f429451n;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("titleTv");
                        throw null;
                    }
                    textView3.setText(com.tencent.mm.R.string.a_w);
                    break;
                }
            case AFFROAM_TASK_STATE_STOPPED:
                java.lang.String str = j0Var instanceof qo1.c1 ? com.tencent.mm.plugin.backup.roambackup.w1.f92924b : com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                android.widget.TextView textView4 = lVar.f429451n;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView4.setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.n0l, str));
                break;
            case AFFROAM_TASK_STATE_ERROR:
                switch (i0Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        java.lang.String str2 = j0Var instanceof qo1.c1 ? com.tencent.mm.plugin.backup.roambackup.w1.f92924b : com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
                        android.widget.TextView textView5 = lVar.f429451n;
                        if (textView5 == null) {
                            kotlin.jvm.internal.o.o("titleTv");
                            throw null;
                        }
                        textView5.setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.n08, str2));
                        break;
                    case 4:
                        if (j0Var instanceof qo1.c1) {
                            android.widget.TextView textView6 = lVar.f429451n;
                            if (textView6 == null) {
                                kotlin.jvm.internal.o.o("titleTv");
                                throw null;
                            }
                            textView6.setText(com.tencent.mm.R.string.f492879n06);
                            break;
                        } else {
                            po1.c cVar = po1.d.f357294i;
                            com.tencent.wechat.aff.affroam.u uVar = ((qo1.f0) j0Var).f365475a.f215832g;
                            kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
                            po1.d a18 = cVar.a(uVar);
                            android.widget.TextView textView7 = lVar.f429451n;
                            if (textView7 == null) {
                                kotlin.jvm.internal.o.o("titleTv");
                                throw null;
                            }
                            textView7.setText(textView7.getContext().getString(com.tencent.mm.R.string.f492877n04, a18.b()));
                            break;
                        }
                    case 5:
                    case 7:
                        android.widget.TextView textView8 = lVar.f429451n;
                        if (textView8 == null) {
                            kotlin.jvm.internal.o.o("titleTv");
                            throw null;
                        }
                        textView8.setText(com.tencent.mm.R.string.f492876n03);
                        break;
                    case 8:
                        android.widget.TextView textView9 = lVar.f429451n;
                        if (textView9 == null) {
                            kotlin.jvm.internal.o.o("titleTv");
                            throw null;
                        }
                        textView9.setText(com.tencent.mm.R.string.mzl);
                        break;
                }
            case AFFROAM_TASK_STATE_IMPORTING:
                android.widget.TextView textView10 = lVar.f429451n;
                if (textView10 == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView10.setText(com.tencent.mm.R.string.n0b);
                break;
            case AFFROAM_TASK_STATE_CONNECTING:
                android.widget.TextView textView11 = lVar.f429451n;
                if (textView11 == null) {
                    kotlin.jvm.internal.o.o("titleTv");
                    throw null;
                }
                textView11.setText(com.tencent.mm.R.string.mzx);
                break;
        }
        return jz5.f0.f302826a;
    }
}
