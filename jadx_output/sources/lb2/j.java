package lb2;

/* loaded from: classes5.dex */
public class j extends lb2.l implements in5.c {

    /* renamed from: s */
    public static final com.tencent.mm.sdk.platformtools.o4 f317738s = com.tencent.mm.sdk.platformtools.o4.M("FINDER_CONFIG_USER_KEY");

    /* renamed from: g */
    public final java.lang.Object f317739g;

    /* renamed from: h */
    public java.lang.String f317740h;

    /* renamed from: i */
    public java.util.ArrayList f317741i;

    /* renamed from: m */
    public mb2.a f317742m;

    /* renamed from: n */
    public yz5.l f317743n;

    /* renamed from: o */
    public final androidx.lifecycle.j0 f317744o;

    /* renamed from: p */
    public java.lang.String f317745p;

    /* renamed from: q */
    public boolean f317746q;

    /* renamed from: r */
    public yz5.a f317747r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.Object obj, java.lang.String title) {
        super(title);
        kotlin.jvm.internal.o.g(title, "title");
        this.f317739g = obj;
        this.f317743n = lb2.f.f317730d;
        this.f317744o = new androidx.lifecycle.j0();
        this.f317745p = "";
    }

    public static /* synthetic */ lb2.j d(lb2.j jVar, e42.b0 b0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindExpConfig");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        jVar.c(b0Var, z17);
        return jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r4 == null) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final lb2.j a(java.lang.String r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb2.j.a(java.lang.String, java.util.List, java.util.List):lb2.j");
    }

    public final lb2.j b(java.lang.String dyConfigKey) {
        kotlin.jvm.internal.o.g(dyConfigKey, "dyConfigKey");
        this.f317742m = new mb2.g(this.f317739g, dyConfigKey, new lb2.b(this));
        return this;
    }

    public final lb2.j c(e42.b0 expKey, boolean z17) {
        kotlin.jvm.internal.o.g(expKey, "expKey");
        this.f317742m = new mb2.i(z17, this.f317739g, expKey, new lb2.c(this));
        return this;
    }

    public final lb2.j e(int i17, java.lang.String exptKey) {
        kotlin.jvm.internal.o.g(exptKey, "exptKey");
        this.f317742m = new mb2.c(this.f317739g, i17, exptKey, new lb2.d(this));
        return this;
    }

    public final lb2.j f(yz5.l clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f317743n = clickListener;
        return this;
    }

    public final lb2.j g(int i17, java.lang.String exptKey) {
        kotlin.jvm.internal.o.g(exptKey, "exptKey");
        this.f317742m = new mb2.k(this.f317739g, i17, exptKey, new lb2.e(this));
        return this;
    }

    @Override // in5.c
    public long getItemId() {
        java.lang.String str = this.f317740h;
        int hashCode = str != null ? str.hashCode() : 0;
        return hashCode + (this.f317739g != null ? r2.hashCode() : 0);
    }

    public int h() {
        return 0;
    }

    public final void i(int i17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        mb2.a aVar;
        java.util.ArrayList arrayList = this.f317741i;
        int i18 = i17 > (arrayList != null ? arrayList.size() : 0) ? -1 : i17;
        this.f317750e = i18;
        java.util.ArrayList arrayList2 = this.f317741i;
        if (arrayList2 != null && (aVar = (mb2.a) kz5.n0.a0(arrayList2, i18)) != null) {
            this.f317744o.setValue(aVar.c());
        }
        java.lang.String str = this.f317740h;
        if (str != null && (o4Var = f317738s) != null) {
            o4Var.putInt(str, i17);
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f317743n.invoke(java.lang.Integer.valueOf(i17));
    }

    public boolean j() {
        return this instanceof mb2.d;
    }

    public java.util.List k() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = this.f317741i;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedList.add(((mb2.a) it.next()).f325334b);
            }
        }
        mb2.a aVar = this.f317742m;
        if (aVar != null) {
            linkedList.add(aVar.f325334b + ':' + aVar.c());
        }
        return linkedList;
    }

    public final lb2.j l() {
        mb2.a aVar = this.f317742m;
        if (aVar != null) {
            aVar.b();
        }
        return this;
    }

    public void n(int i17) {
        android.app.Activity activity;
        if (j()) {
            int i18 = i17 + 1;
            java.util.ArrayList arrayList = this.f317741i;
            if (i18 == (arrayList != null ? arrayList.size() : 0)) {
                java.lang.ref.WeakReference weakReference = this.f317751f;
                if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                    return;
                }
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(activity);
                int i19 = 1;
                linearLayout.setOrientation(1);
                linearLayout.setPadding(50, 30, 50, 30);
                java.lang.Object r17 = r();
                android.widget.TextView textView = new android.widget.TextView(activity);
                textView.setText("当前值: " + r17);
                textView.setTextColor(textView.getResources().getColor(android.R.color.darker_gray));
                textView.setTextSize(14.0f);
                textView.setPadding(0, 0, 0, 20);
                android.widget.EditText editText = new android.widget.EditText(activity);
                editText.setHint("请输入新的值");
                editText.setTextColor(editText.getResources().getColor(android.R.color.black));
                java.lang.Object obj = this.f317739g;
                if (obj instanceof java.lang.Integer ? true : obj instanceof java.lang.Long) {
                    i19 = 4098;
                } else {
                    if (obj instanceof java.lang.Float ? true : obj instanceof java.lang.Double) {
                        i19 = 8194;
                    }
                }
                editText.setInputType(i19);
                editText.setText(java.lang.String.valueOf(r17));
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                new android.app.AlertDialog.Builder(activity).setTitle("自定义输入 - " + this.f317749d).setView(linearLayout).setPositiveButton("确定", new lb2.g(editText, activity, this, r17, i17)).setOnDismissListener(new lb2.h(this)).setNegativeButton("取消", (android.content.DialogInterface.OnClickListener) null).show();
                editText.post(new lb2.i(editText));
                return;
            }
        }
        i(i17);
        this.f317747r = null;
    }

    public void o() {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderFakeConfig", "code:" + hashCode() + "  keyName " + this.f317740h + " reset");
        this.f317750e = -1;
        java.lang.String str = this.f317740h;
        if (str == null || (o4Var = f317738s) == null) {
            return;
        }
        o4Var.putInt(str, -1);
    }

    public java.lang.String p() {
        mb2.a aVar = this.f317742m;
        if (aVar != null) {
            java.lang.String str = aVar.f325334b + ':' + aVar.c();
            if (str != null) {
                return str;
            }
        }
        return "None";
    }

    public final lb2.j q(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f317745p = tag;
        return this;
    }

    public java.lang.Object r() {
        java.lang.Object obj;
        int i17;
        mb2.a aVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        java.lang.Object obj2 = this.f317739g;
        if (a17) {
            int i18 = this.f317750e;
            java.util.ArrayList arrayList = this.f317741i;
            if (i18 < (arrayList != null ? arrayList.size() : 0) && (i17 = this.f317750e) >= 0) {
                java.util.ArrayList arrayList2 = this.f317741i;
                if (arrayList2 == null || (aVar = (mb2.a) kz5.n0.a0(arrayList2, i17)) == null || (obj = aVar.c()) == null) {
                    return obj2;
                }
                return obj;
            }
        }
        mb2.a aVar2 = this.f317742m;
        if (aVar2 == null || (obj = aVar2.f325336d) == null) {
            return obj2;
        }
        return obj;
    }
}
