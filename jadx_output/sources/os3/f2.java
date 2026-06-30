package os3;

/* loaded from: classes8.dex */
public class f2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f348077d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f348078e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailAddrListUI f348079f;

    public f2(com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI, android.content.Context context) {
        this.f348079f = mailAddrListUI;
        this.f348077d = context;
    }

    public final java.lang.String a(ks3.u uVar) {
        if (uVar == null) {
            return null;
        }
        java.lang.String str = uVar.f311753h;
        char charAt = str.length() > 1 ? str.charAt(0) : '~';
        if (charAt != '{') {
            return (charAt == '~' || !com.tencent.mm.sdk.platformtools.t8.y0(charAt)) ? "~" : java.lang.String.valueOf(charAt);
        }
        char charAt2 = str.charAt(1);
        return com.tencent.mm.sdk.platformtools.t8.O0(charAt2) ? java.lang.String.valueOf(charAt2) : "~";
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f348079f.f154875i.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (ks3.u) this.f348079f.f154875i.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        os3.e2 e2Var;
        if (view == null || view.getTag() == null) {
            e2Var = new os3.e2(this);
            view = android.view.View.inflate(this.f348077d, com.tencent.mm.R.layout.cbe, null);
            e2Var.f348064a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ldv);
            e2Var.f348065b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ldx);
            e2Var.f348066c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ldu);
            e2Var.f348067d = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.ldy);
            view.setTag(e2Var);
        } else {
            e2Var = (os3.e2) view.getTag();
        }
        com.tencent.mm.plugin.qqmail.ui.MailAddrListUI mailAddrListUI = this.f348079f;
        ks3.u uVar = (ks3.u) mailAddrListUI.f154875i.get(i17);
        ks3.u uVar2 = i17 > 0 ? (ks3.u) mailAddrListUI.f154875i.get(i17 - 1) : null;
        java.lang.String a17 = a(uVar);
        java.lang.String a18 = a(uVar2);
        if (a17 == null) {
            e2Var.f348064a.setVisibility(8);
        } else if (a17.equals(a18)) {
            e2Var.f348064a.setVisibility(8);
        } else {
            e2Var.f348064a.setText(a17.toUpperCase());
            e2Var.f348064a.setVisibility(0);
        }
        e2Var.f348065b.setText(uVar.f311750e);
        e2Var.f348066c.setText(uVar.f311751f);
        e2Var.f348067d.setChecked(((java.util.HashMap) this.f348078e).get(uVar.f311751f) != null);
        return view;
    }
}
