package com.tencent.weui.base.preference;

/* loaded from: classes7.dex */
public abstract class WeUIPreference extends com.tencent.mm.ui.BaseActivity {
    public android.widget.ListView A;
    public android.content.SharedPreferences B;
    public boolean C = false;

    /* renamed from: z, reason: collision with root package name */
    public ex5.g f220127z;

    public abstract boolean T6(ex5.b bVar, android.preference.Preference preference);

    public int getFooterResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c0n;
    }

    public abstract int getResourceId();

    @Override // android.app.Activity
    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return super.onContextItemSelected(menuItem);
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
        this.B = sharedPreferences;
        this.f220127z = new ex5.g(this, sharedPreferences);
        this.A = (android.widget.ListView) findViewById(android.R.id.list);
        int footerResourceId = getFooterResourceId();
        if (footerResourceId != -1) {
            this.A.addFooterView(getLayoutInflater().inflate(footerResourceId, (android.view.ViewGroup) null));
        }
        ex5.g gVar = this.f220127z;
        gVar.f257263s = new ex5.c(this);
        gVar.notifyDataSetChanged();
        int resourceId = getResourceId();
        if (resourceId != -1) {
            ex5.g gVar2 = this.f220127z;
            gVar2.f257261q = true;
            ex5.h hVar = gVar2.f257251d;
            hVar.getClass();
            android.content.res.XmlResourceParser xml = hVar.f257266a.getResources().getXml(resourceId);
            if (xml != null) {
                try {
                    hVar.c(xml, gVar2, true);
                } finally {
                    xml.close();
                }
            }
            gVar2.f257261q = false;
            gVar2.notifyDataSetChanged();
        }
        this.A.setAdapter((android.widget.ListAdapter) this.f220127z);
        this.A.setOnItemClickListener(new ex5.d(this));
        this.A.setOnItemLongClickListener(new ex5.e(this));
        this.A.setOnScrollListener(new ex5.f(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f220127z.notifyDataSetChanged();
        super.onResume();
    }
}
