package ix3;

/* loaded from: classes12.dex */
public final class z1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f295620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295620d = jz5.h.b(new ix3.y1(this));
    }

    public final em.a3 T6() {
        return (em.a3) ((jz5.n) this.f295620d).getValue();
    }

    public final void U6(java.lang.String str) {
        try {
            if (!(com.tencent.mm.vfs.w6.j(str) && com.tencent.mm.vfs.w6.k(str) > 0)) {
                throw new java.lang.IllegalArgumentException("showExif error file not exist!".toString());
            }
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, true);
            if (i17 == null) {
                throw new java.lang.IllegalArgumentException("showExif error null file path".toString());
            }
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("=== EXIF时间信息 ===\n\n");
            java.lang.String[] strArr = {androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED};
            for (int i18 = 0; i18 < 3; i18++) {
                java.lang.String str2 = strArr[i18];
                sb6.append(str2 + ": " + exifInterface.getAttribute(str2) + '\n');
            }
            em.a3 T6 = T6();
            if (T6.f254062b == null) {
                T6.f254062b = (android.widget.TextView) T6.f254061a.findViewById(com.tencent.mm.R.id.t8t);
            }
            T6.f254062b.setText(sb6.toString());
            em.a3 T62 = T6();
            if (T62.f254065e == null) {
                T62.f254065e = (com.tencent.mm.ui.widget.button.WeButton) T62.f254061a.findViewById(com.tencent.mm.R.id.ssx);
            }
            T62.f254065e.setVisibility(0);
            em.a3 T63 = T6();
            if (T63.f254065e == null) {
                T63.f254065e = (com.tencent.mm.ui.widget.button.WeButton) T63.f254061a.findViewById(com.tencent.mm.R.id.ssx);
            }
            T63.f254065e.setOnClickListener(new ix3.x1(exifInterface, this, str));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RepairerFileMsgDebugUIC", e17, "showExif error", new java.lang.Object[0]);
            em.a3 T64 = T6();
            if (T64.f254062b == null) {
                T64.f254062b = (android.widget.TextView) T64.f254061a.findViewById(com.tencent.mm.R.id.t8t);
            }
            T64.f254062b.setText("读取EXIF信息失败: " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.emi;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("文件消息调试页面");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new ix3.u1(this));
        }
        long longExtra = getIntent().getLongExtra("Chat_Msg_Id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(stringExtra, longExtra);
        i95.m c17 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(tg3.u0.Z1((tg3.u0) c17, k17, null, 2, null));
        em.a3 T6 = T6();
        if (T6.f254066f == null) {
            T6.f254066f = (android.widget.Button) T6.f254061a.findViewById(com.tencent.mm.R.id.upa);
        }
        T6.f254066f.setOnClickListener(new ix3.v1(this, longExtra, r6Var));
        em.a3 T62 = T6();
        if (T62.f254063c == null) {
            T62.f254063c = (android.widget.Button) T62.f254061a.findViewById(com.tencent.mm.R.id.t98);
        }
        T62.f254063c.setOnClickListener(new ix3.w1(stringExtra, longExtra, this));
        ub0.o oVar = (ub0.o) i95.n0.c(ub0.o.class);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (((ub0.p) oVar).Ai(o17)) {
            em.a3 T63 = T6();
            if (T63.f254064d == null) {
                T63.f254064d = (android.widget.FrameLayout) T63.f254061a.findViewById(com.tencent.mm.R.id.t8s);
            }
            T63.f254064d.setVisibility(0);
            U6(r6Var.o());
        }
    }
}
