package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class f1 implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic f158725b;

    public f1(com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic, int i17) {
        this.f158725b = scanCodeSheetItemLogic;
        this.f158724a = i17;
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic scanCodeSheetItemLogic = this.f158725b;
        if (itemId == 7) {
            android.content.Context context = scanCodeSheetItemLogic.f158647d;
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_translate, context.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            return;
        }
        if (menuItem.getItemId() == this.f158724a && scanCodeSheetItemLogic.f158648e != null) {
            o11.f fVar = new o11.f();
            fVar.f342079c = true;
            imageView.setBackground(null);
            imageView.setImageDrawable(null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeSheetItemLogic", "mCodeInfoRespItem.UrlType: " + scanCodeSheetItemLogic.f158648e.f370201g);
            int i17 = scanCodeSheetItemLogic.f158648e.f370201g;
            if (i17 == 4) {
                fVar.f342091o = com.tencent.mm.R.raw.actionsheet_default_appbrand_icon;
                fVar.f342096t = true;
                n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
                return;
            }
            if (i17 == 3) {
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar_round;
                fVar.f342096t = true;
                n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
                return;
            }
            if (i17 == 11) {
                if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    fVar.f342091o = com.tencent.mm.R.raw.default_avatar_round;
                    fVar.f342096t = true;
                    n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
                    return;
                }
                return;
            }
            if (i17 == 1) {
                fVar.f342096t = true;
                fVar.f342097u = i65.a.b(scanCodeSheetItemLogic.f158647d, 4);
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
                n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
                return;
            }
            if (i17 == 2) {
                android.content.Context context2 = scanCodeSheetItemLogic.f158647d;
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icons_outlined_group_detail, context2.getResources().getColor(com.tencent.mm.R.color.FG_0)));
                return;
            }
            if (i17 == 7) {
                fVar.f342096t = true;
                fVar.f342097u = i65.a.b(scanCodeSheetItemLogic.f158647d, 4);
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
                n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
                return;
            }
            if (i17 == 6) {
                android.content.Context context3 = scanCodeSheetItemLogic.f158647d;
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context3, com.tencent.mm.R.raw.icons_outlined_wechatpay, context3.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            } else if (i17 == 5) {
                android.content.Context context4 = scanCodeSheetItemLogic.f158647d;
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context4, com.tencent.mm.R.raw.icons_outlined_pay_reward_code, context4.getResources().getColor(com.tencent.mm.R.color.FG_0)));
            } else if (i17 == 9) {
                fVar.f342091o = com.tencent.mm.R.raw.default_avatar_round;
                fVar.f342096t = true;
                n11.a.b().h(scanCodeSheetItemLogic.f158648e.f370204m, imageView, fVar.a());
            }
        }
    }
}
