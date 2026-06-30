package fn2;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fn2.s sVar) {
        super(0);
        this.f264341d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        fn2.s sVar = this.f264341d;
        android.widget.EditText editText = sVar.f264373i;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (sVar.f264381t) {
            sVar.f264381t = false;
            android.widget.EditText editText2 = sVar.f264373i;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            if (str.length() == 0) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = sVar.f264374m;
                if (weImageView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                sVar.f264371g.invoke();
                com.tencent.mm.plugin.finder.live.widget.dv dvVar = sVar.f264379r;
                if (dvVar != null) {
                    dvVar.e();
                }
                com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = sVar.f264380s;
                if (dvVar2 != null) {
                    dvVar2.b();
                }
                kotlinx.coroutines.r2 r2Var = sVar.f264382u;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                sVar.f264382u = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fn2.n(sVar, str, null), 3, null);
                hn2.k.f282534a.a(str, sVar.f264374m, sVar.f264375n);
            }
        }
        return jz5.f0.f302826a;
    }
}
