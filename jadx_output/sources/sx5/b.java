package sx5;

/* loaded from: classes13.dex */
public class b implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.d f413698d;

    public b(sx5.d dVar) {
        this.f413698d = dVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        sx5.c cVar;
        int action = motionEvent.getAction();
        sx5.d dVar = this.f413698d;
        if (action == 0) {
            dVar.f413719f = false;
            dVar.f413720g = motionEvent.getX();
            sx5.c cVar2 = dVar.f413714a;
            if (cVar2 != null) {
                sx5.a1 a1Var = ((sx5.o0) cVar2).f413750a;
                java.util.Timer timer = a1Var.E1;
                if (timer != null) {
                    timer.cancel();
                    a1Var.E1.purge();
                    a1Var.E1 = null;
                }
                a1Var.w(new sx5.w(a1Var));
            }
        } else if (motionEvent.getAction() == 2) {
            float width = dVar.f413715b.getWidth() + (motionEvent.getX() - dVar.f413720g);
            android.widget.ImageView imageView = dVar.f413716c;
            if (width < 0.0f) {
                width = 0.0f;
            } else if (width > imageView.getWidth()) {
                width = imageView.getWidth();
            }
            float width2 = (width * 100.0f) / imageView.getWidth();
            dVar.f413721h = width2;
            dVar.a(width2, true);
            sx5.c cVar3 = dVar.f413714a;
            if (cVar3 != null) {
                sx5.a1 a1Var2 = ((sx5.o0) cVar3).f413750a;
                java.util.Timer timer2 = a1Var2.E1;
                if (timer2 != null) {
                    timer2.cancel();
                    a1Var2.E1.purge();
                    a1Var2.E1 = null;
                }
                a1Var2.w(new sx5.w(a1Var2));
            }
            dVar.f413719f = true;
        } else {
            if (dVar.f413719f && (cVar = dVar.f413714a) != null) {
                float f17 = dVar.f413721h;
                sx5.a1 a1Var3 = ((sx5.o0) cVar).f413750a;
                double d17 = (a1Var3.N * f17) / 100.0d;
                a1Var3.w(new sx5.f0(a1Var3, false, d17));
                a1Var3.a(d17);
                a1Var3.y();
            }
            dVar.f413719f = false;
        }
        return true;
    }
}
