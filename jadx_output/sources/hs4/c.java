package hs4;

/* loaded from: classes9.dex */
public class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f284613d;

    /* renamed from: e, reason: collision with root package name */
    public db5.g4 f284614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hs4.d f284615f;

    public c(hs4.d dVar) {
        this.f284615f = dVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f284614e.size() + this.f284615f.f284622g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17 < this.f284614e.size() ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        hs4.b bVar = (hs4.b) k3Var;
        int size = this.f284614e.size();
        hs4.d dVar = this.f284615f;
        if (i17 >= size) {
            if (dVar.f284622g.size() <= 0 || i17 >= this.f284614e.size() + dVar.f284622g.size()) {
                return;
            }
            db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) dVar.f284622g.f228344d).get(i17 - this.f284614e.size());
            bVar.f284606d.setText(h4Var.getTitle());
            if (dVar.f284628m >= this.f284614e.size() + dVar.f284622g.size()) {
                dVar.f284628m = 0;
            }
            android.graphics.drawable.Drawable icon = h4Var.getIcon();
            android.content.Context context = dVar.f284617b;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bVar.f284608f;
            if (icon != null) {
                weImageView.setVisibility(0);
                weImageView.setImageDrawable(h4Var.getIcon());
                int i18 = h4Var.f228378v;
                if (i18 != 0) {
                    weImageView.setIconColor(i18);
                } else {
                    weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.a9e));
                }
            } else {
                weImageView.setVisibility(8);
            }
            boolean z17 = h4Var.f228375s;
            android.widget.LinearLayout linearLayout = bVar.f284611i;
            android.widget.TextView textView = bVar.f284606d;
            if (z17) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478728fj));
                linearLayout.setBackgroundResource(com.tencent.mm.R.color.a9e);
                weImageView.setAlpha(0.1f);
            } else {
                textView.setTextColor(textView.getTextColors());
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.and);
            }
            android.widget.TextView textView2 = bVar.f284607e;
            if (textView2 != null) {
                if (android.text.TextUtils.isEmpty(h4Var.f228373q)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(h4Var.f228373q);
                }
                textView2.setImportantForAccessibility(2);
            }
            linearLayout.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdw, textView.getText(), textView2.getText()));
            boolean z18 = h4Var.f228375s;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = bVar.f284609g;
            if (z18) {
                if (weImageView2 != null) {
                    weImageView2.setVisibility(4);
                }
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478728fj));
                weImageView.setAlpha(0.1f);
            } else {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478729fk));
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
            }
            android.widget.ImageView imageView = bVar.f284610h;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (dVar.f284628m >= this.f284614e.size()) {
            dVar.f284628m = 0;
        }
        bVar.f284611i.setFocusable(true);
        db5.h4 h4Var2 = (db5.h4) ((java.util.ArrayList) this.f284614e.f228344d).get(i17);
        java.lang.CharSequence title = h4Var2.getTitle();
        android.widget.TextView textView3 = bVar.f284606d;
        textView3.setText(title);
        android.graphics.drawable.Drawable icon2 = h4Var2.getIcon();
        android.content.Context context2 = dVar.f284617b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = bVar.f284608f;
        if (icon2 != null) {
            weImageView3.setVisibility(0);
            weImageView3.setImageDrawable(h4Var2.getIcon());
            int i19 = h4Var2.f228378v;
            if (i19 != 0) {
                weImageView3.setIconColor(i19);
            } else {
                weImageView3.setIconColor(context2.getResources().getColor(com.tencent.mm.R.color.a9e));
            }
        } else if (dVar.f284627l) {
            weImageView3.setVisibility(4);
        } else {
            weImageView3.setVisibility(8);
        }
        boolean z19 = h4Var2.f228375s;
        android.widget.LinearLayout linearLayout2 = bVar.f284611i;
        if (z19) {
            textView3.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.f478728fj));
            weImageView3.setAlpha(77);
            linearLayout2.setBackgroundResource(com.tencent.mm.R.color.a9e);
        } else {
            weImageView3.setAlpha(255);
            textView3.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        }
        android.widget.TextView textView4 = bVar.f284607e;
        if (textView4 != null) {
            if (android.text.TextUtils.isEmpty(h4Var2.f228373q)) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setText(h4Var2.f228373q);
                if (dVar.f284626k) {
                    textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
            }
        }
        linearLayout2.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdw, textView3.getText(), textView4.getText()));
        boolean z27 = h4Var2.f228375s;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = bVar.f284609g;
        if (z27) {
            if (weImageView4 != null) {
                weImageView4.setVisibility(4);
            }
            textView4.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.f478728fj));
        } else {
            textView4.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.f478729fk));
            if (dVar.f284628m == i17) {
                if (weImageView4 != null) {
                    weImageView4.setVisibility(0);
                }
                linearLayout2.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kdx, textView3.getText(), textView4.getText()));
            } else if (weImageView4 != null) {
                weImageView4.setVisibility(4);
            }
        }
        android.widget.ImageView imageView2 = bVar.f284610h;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (dVar.f284622g.size() == 0 && i17 == this.f284614e.size() - 1 && imageView2 != null) {
            ((android.widget.LinearLayout.LayoutParams) imageView2.getLayoutParams()).setMargins(0, 0, 0, 0);
        }
        textView4.setImportantForAccessibility(2);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new hs4.b(this, android.view.LayoutInflater.from(this.f284615f.f284617b).inflate(com.tencent.mm.R.layout.bt9, viewGroup, false), i17);
    }
}
