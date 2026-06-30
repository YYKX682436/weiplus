package zy4;

/* loaded from: classes15.dex */
public class m implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f477684d;

    /* renamed from: e, reason: collision with root package name */
    public final yy4.a f477685e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f477686f;

    public m(android.widget.ImageView imageView, android.widget.TextView textView, yy4.a aVar, android.view.View view) {
        this.f477684d = textView;
        this.f477685e = aVar;
        this.f477686f = view;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        android.widget.TextView textView = this.f477684d;
        if (z17) {
            textView.setVisibility(0);
            return true;
        }
        textView.setVisibility(8);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        yy4.a aVar = this.f477685e;
        if (aVar == null) {
            return null;
        }
        return (java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.welab.ui.WelabMainUI.f188099q).get(aVar.field_LabsAppId);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f477686f;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        return false;
    }
}
