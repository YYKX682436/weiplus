package com.tencent.mm.plugin.label.ui.widget;

/* loaded from: classes11.dex */
public class MMLabelPanel extends com.tencent.mm.ui.base.MMTagPanel {
    public android.content.Context M;
    public boolean N;
    public boolean P;
    public db5.b7 Q;
    public db5.b7 R;
    public k93.b0 S;
    public k93.b0 T;
    public int U;
    public java.lang.String V;

    public MMLabelPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = false;
        this.P = false;
        this.U = 0;
        this.V = null;
        y(context);
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public java.lang.String c(android.widget.EditText editText, android.text.Editable editable, java.lang.String str, android.text.TextWatcher textWatcher) {
        int c17;
        editText.removeTextChangedListener(textWatcher);
        if (this.G > 0) {
            if (editable != null) {
                java.lang.String obj = editable.toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                    int f17 = com.tencent.mm.ui.tools.v4.f(obj);
                    com.tencent.mm.ui.tools.v4.d(this.G, obj);
                    int i17 = this.G;
                    if (f17 > i17 && (c17 = com.tencent.mm.ui.tools.v4.c(i17, obj)) > 0 && c17 < this.G && c17 < obj.length()) {
                        editText.setText(obj.substring(0, c17 + 1));
                        editText.setSelection(editText.getText().length());
                    }
                }
            }
            str = editText.getText() != null ? editText.getText().toString() : "";
        }
        editText.addTextChangedListener(textWatcher);
        return str;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void d(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f228295a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i17 = i();
        t(i17, trim, z17);
        if (this.f197582n) {
            addView(i17.f228296b, getChildCount() - 1);
        } else {
            addView(i17.f228296b);
        }
        linkedList.add(i17);
        h();
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public int getEditViewLayoutId() {
        return com.tencent.mm.R.layout.byp;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public java.util.ArrayList<java.lang.String> getSelectTagList() {
        android.widget.TextView textView;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (b7Var != null && b7Var != this.R && b7Var != this.Q && !com.tencent.mm.sdk.platformtools.t8.K0(b7Var.f228295a) && (textView = b7Var.f228296b) != null && ((java.lang.Integer) textView.getTag()).intValue() == 1) {
                arrayList.add(b7Var.f228295a);
            }
        }
        return arrayList;
    }

    public java.util.ArrayList<java.lang.String> getTagListWithIcon() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b7Var.f228295a) && b7Var != this.R && b7Var != this.Q) {
                arrayList.add(b7Var.f228295a);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public android.widget.TextView j() {
        android.widget.TextView j17 = super.j();
        j17.setPadding(i65.a.a(this.M, 12.0f), i65.a.a(this.M, 5.0f), i65.a.a(this.M, 12.0f), i65.a.a(this.M, 6.0f));
        j17.setGravity(17);
        j17.setMinHeight(i65.a.a(this.M, 32.0f));
        j17.setTextSize(0, i65.a.f(this.M, com.tencent.mm.R.dimen.f480586a84));
        return j17;
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void m() {
        getTagCount();
    }

    @Override // com.tencent.mm.ui.base.MMTagPanel
    public void r(java.util.Collection collection, java.util.List list) {
        boolean z17;
        android.view.View view;
        e();
        if (this.f197582n) {
            addView(this.E);
        }
        if (list == null) {
            if (this.P) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags is null, needNewLebal.");
                addView(this.R.f228297c);
                return;
            }
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (collection != null) {
                z18 = collection.contains(str);
            }
            d(str, z18);
        }
        if (this.P) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needNewLebal.");
            addView(this.R.f228297c);
        }
        if (this.N) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needGotoMorePage.");
            addView(this.Q.f228297c);
        }
        java.util.Iterator it6 = this.A.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z17 = false;
                break;
            }
            db5.b7 b7Var = (db5.b7) it6.next();
            if (b7Var != this.Q && b7Var != this.R) {
                z17 = true;
                break;
            }
        }
        if (!this.N || (view = this.Q.f228297c) == null) {
            return;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags.isEmpty.");
        android.view.View view2 = this.Q.f228297c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setClickDetailCallBack(k93.b0 b0Var) {
        this.S = b0Var;
    }

    public void setClickNewLebalCallBack(k93.b0 b0Var) {
        this.T = b0Var;
    }

    public void setMaxLineSize(int i17) {
    }

    public void setNeedAddLastItemToMove(boolean z17) {
        this.N = z17;
    }

    public void setNeedNewLebal(boolean z17) {
        this.P = z17;
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(b7Var.f228296b);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(b7Var.f228296b, "list_tag_item");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f228296b, "note_sid", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f228296b, "add_username", str2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f228296b, "list_tag_type", str3);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(b7Var.f228296b, new k93.y(this, b7Var));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(b7Var.f228296b, 8, i17);
        }
    }

    public void w(java.lang.String str, boolean z17, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.MMLabelPanel", "addTag2, want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f228295a)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.MMLabelPanel", "addTag2,want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i18 = i();
        t(i18, trim, z17);
        addView(i18.f228296b, i17);
        linkedList.add(i18);
        h();
    }

    public void x() {
        android.view.View inflate;
        this.R = i();
        if (this.U != 0) {
            inflate = android.view.LayoutInflater.from(getContext()).inflate(this.U, (android.view.ViewGroup) null);
            if (this.V != null) {
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486104k70)).setText(this.V);
            }
        } else {
            inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a2a, (android.view.ViewGroup) null);
            ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.k6z)).setImageDrawable(com.tencent.mm.ui.uk.e(this.M, com.tencent.mm.R.raw.icons_filled_add, i65.a.d(getContext(), com.tencent.mm.R.color.BW_70)));
        }
        inflate.setOnClickListener(new k93.a0(this));
        this.R.f228297c = inflate;
        this.Q.f228296b.setText("");
    }

    public final void y(android.content.Context context) {
        this.M = context;
        this.Q = i();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.a2b, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485180gt5);
        inflate.setOnClickListener(new k93.z(this));
        if (this.Q != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(this.M, com.tencent.mm.R.raw.icons_outlined_more, i65.a.d(getContext(), com.tencent.mm.R.color.BW_70)));
        }
        this.Q.f228296b.setText("");
        this.Q.f228297c = inflate;
        x();
        setTagNormalBG(com.tencent.mm.R.drawable.f482129b31);
        setTagSelectedBG(com.tencent.mm.R.drawable.f482130b32);
        setTagNormalTextColorRes(com.tencent.mm.R.color.FG_2);
        setTagSelectedTextColorRes(com.tencent.mm.R.color.f478863j9);
        setHintTextSize(i65.a.f(context, com.tencent.mm.R.dimen.f480586a84));
    }

    public MMLabelPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = false;
        this.P = false;
        this.U = 0;
        this.V = null;
        y(context);
    }
}
