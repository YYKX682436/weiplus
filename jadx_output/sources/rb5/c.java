package rb5;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393864d;

    public c(rb5.l lVar) {
        this.f393864d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yn.e b17;
        rb5.l lVar = this.f393864d;
        lVar.f393897x = lVar.f393880d.getController().f208673u0;
        if (!lVar.f393887n) {
            com.tencent.mars.xlog.Log.e("ChattingCompat", "start chatting but last chatting does't be close!");
            lVar.b();
        }
        boolean isFinishing = lVar.f393880d.isFinishing();
        rb5.k kVar = rb5.k.ACTIVITY_PAUSE;
        if (!isFinishing) {
            if (!(lVar.f393893t == kVar) && lVar.f393887n) {
                lVar.f393887n = false;
                java.util.Iterator it = lVar.f393895v.iterator();
                while (it.hasNext()) {
                    ((wn.q) it.next()).G4();
                }
                android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", lVar.f393890q);
                putExtra.putExtra("Chat_Self", lVar.f393891r);
                android.os.Bundle bundle = lVar.f393892s;
                if (bundle != null) {
                    putExtra.putExtras(bundle);
                }
                putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
                java.lang.Class cls = lVar.f393899z;
                if (cls != null && !lVar.f393882f.f198152f.f460708c.f201962a.containsKey(cls) && (b17 = com.tencent.mm.ui.chatting.component.d3.b(lVar.f393899z)) != null) {
                    lVar.f393882f.f198152f.z(lVar.f393899z, b17);
                }
                lVar.f393882f.getArguments().putAll(com.tencent.mm.sdk.platformtools.c2.e(putExtra));
                rb5.l.a(lVar, false);
                android.view.View view = lVar.f393882f.getView();
                (view != null ? (com.tencent.mm.ui.base.OnLayoutChangedLinearLayout) view.findViewById(com.tencent.mm.R.id.bkb) : null).setOnChattingLayoutChangedListener(lVar.B);
                lVar.f393885i.setTranslationX((lVar.d().getDecorView().getWidth() == 0 ? lVar.f393880d.getResources().getDisplayMetrics().widthPixels : lVar.d().getDecorView().getWidth()) - 0.1f);
                lVar.f393885i.setVisibility(0);
                al5.a3.d(lVar);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("ChattingCompat", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", java.lang.Boolean.valueOf(lVar.f393893t == kVar), java.lang.Boolean.valueOf(lVar.f393887n));
        lVar.f393889p = true;
    }
}
